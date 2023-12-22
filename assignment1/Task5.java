package assignment1;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("температураны енгізіңіз:");
        int a= scan.nextInt();
        if (a<0){
            System.out.println("It is cold outside.");
        }
        else{
            System.out.println("it is warm outside.");
        }

    }
}
