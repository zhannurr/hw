package hw4;

public class Task4 {
    public static void main(String[] args){
        Reader[] reader = new Reader[3];
        reader[0]= new Reader("Zhannur Zhaksybek",231019,"SE","30.10.05","87778889900",3);
        reader[1]= new Reader("Alina Bayram",231020,"EE","17.09.06","83332223344",1);
        reader[2]= new Reader("Meruert Boranbai",231017,"IoT","21.07.05","86667778899",2);

        Book[] books = new Book[6];
        books[0]= new Book("Baisultan A.","Java course");
        books[1]= new Book("Azhikhan A.","Calculus");
        books[2]= new Book("Bizhigitova N.","linear algebra");

        System.out.println(reader[0].takeBook());
        System.out.println(reader[1].takeBook());
        System.out.println(reader[2].takeBook());

        for(int i=0; i<3; i++){
            System.out.print(reader[i].tookBook() + ": ");
            for(int j=0; j<=3; j++){
                if (j==reader[i].getBooks()){
                    System.out.println();
                    break;
                }
                else {
                    System.out.print(books[j].bookInfo()+"  ");
                }
            }
        }

        System.out.println(reader[0].returnBook());
        System.out.println(reader[1].returnBook());
        System.out.println(reader[2].returnBook());
    }
}
