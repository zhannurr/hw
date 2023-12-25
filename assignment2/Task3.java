package assignment2;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("массив өлшемін таңдаңыз:");
        int n = scan.nextInt();
        int[] array= new int[n];
        System.out.println("массив элементтерін енгізіңіз:");
        for (int i=0; i<n; i++){
            int input=scan.nextInt();
            array[i]=input;
        }
        for (int i=0; i<n; i++){
            if (array[i]%2==0){
                array[i]= -array[i];
            }
        }
        for (int i=0; i<n; i++){
            System.out.print(array[i]+", ");
        }
    }
}
