package assignment1;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter body temperature:");
        float temp= scan.nextFloat();
        boolean isHigh= temp>37;
        boolean isLow= temp<35;
        if (isHigh){
            System.out.println("temperature is high, visit doctor");
        }
        else if (isLow) {
            System.out.println("temperature is low, visit doctor");
        }
        else{
            System.out.println("temperature is normal");
        }
    }
}
