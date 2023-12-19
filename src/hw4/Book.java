package hw4;

public class Book {
    private String bookName;
    private String bookAuthor;
    public Book(String bookAuthor, String bookName){
        this.bookAuthor= bookAuthor;
        this.bookName= bookName;
    }
    public String bookInfo(){
        String inf= bookName+" by "+ bookAuthor;
        return inf;
    }
}
