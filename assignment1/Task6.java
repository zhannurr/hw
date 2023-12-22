package assignment1;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter your name:");
        String name= scan.nextLine();
        System.out.print("Enter your age:");
        int a= scan.nextInt();
        if (a>=18 && a<=31){
            System.out.println( name +", come to the military registration and enlistment office");
        }
    }
}
