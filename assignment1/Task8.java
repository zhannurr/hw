package assignment1;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = scan.nextInt();
        if (age<=20 || age>=60) {
            System.out.println("You do not have to work");
        }
    }
}
