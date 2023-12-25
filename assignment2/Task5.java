package assignment2;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter array size:");
        int n= scan.nextInt();
        int[] array= new int[n];
        System.out.println("Enter array elements:");
        for (int i=0;i<n; i++){
            array[i]= scan.nextInt();
        }
        int max= array[0];
        for (int i=0; i<n;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Maximum element is "+max);
    }
}
