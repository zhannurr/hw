package assignment2;
//Initialize the MULTIPLICATION_TABLE array with the value new int[10][10], fill it with
//the multiplication table and output it to the console in the following form:
//        1 2 3 4 …
//        2 4 6 8 …
//        3 6 9 12 …
//        4 8 12 16 …
//        ...
//The numbers on the line are separated by a space.
//Requirements:
//        • In the main method, the MULTIPLICATION_TABLE array must be filled with the
//multiplication table.
//        • The output text must be 10 lines long.
//        • Each line output must contain 10 numbers separated by a space.
//• The numbers printed must be multiplication tables.

public class Task6 {
    public static void main(String[] args) {
        int[][] MULTIPLICATION_TABLE= new int[10][10];
        int n=1;
        for(int i=0; i<10; i++){
            for (int j=0; j<10;j++){
                MULTIPLICATION_TABLE[i][j]= (j+1)*n;
            }
            n=n+1;
        }
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                if (MULTIPLICATION_TABLE[i][j]<10) {
                    System.out.print(MULTIPLICATION_TABLE[i][j] + "   ");
                } else if (MULTIPLICATION_TABLE[i][j]>=10 && MULTIPLICATION_TABLE[i][j]<99) {
                    System.out.print(MULTIPLICATION_TABLE[i][j] + "  ");
                }else{
                    System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
