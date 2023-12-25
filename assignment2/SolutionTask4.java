package assignment2;
import java.util.Scanner;
public class SolutionTask4 {
    public static int[] firstArray= new int[10];
    public static int[] secondArray= new int[10];
    public static int[] resultArray= new int[20];

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Бірінші массив элементтері:");
        for(int i=0; i< firstArray.length; i++){
            firstArray[i]= scan.nextInt();
        }
        System.out.println("Екінші массив элементтері:");
        for(int i=0; i< secondArray.length; i++){
            secondArray[i]= scan.nextInt();
        }
        int j=0;
        for(int i=0; i< resultArray.length; i++){
                if (i < 10) {
                    resultArray[i] = firstArray[i];
                }
                if (i >= 10) {
                    resultArray[i] = secondArray[j];
                    j++;
                }
        }
        for (int i=0; i<resultArray.length; i++){
            System.out.print(resultArray[i]+" ");
        }
    }
}
