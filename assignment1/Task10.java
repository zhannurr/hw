package assignment1;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter integers:");
        int sum=0;
        while(true){
            String integers= scan.next();
            if(integers.equals("ENTER")) {
                break;
            }
            else{
                sum += Integer.parseInt(integers);

            }
        }
        System.out.println(sum);
    }
}
