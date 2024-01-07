import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Массив өлшемін енгіз:");
        int n = scan.nextInt();
        int[] array= new int[n];
        System.out.println("Массив элементтерін енгізіңіз:");
        for (int i=0; i<n; i++){
            array[i]= scan.nextInt();
        }
        printArray(array);
        System.out.println();
        reverseArray(array);
    }
    public static void printArray(int[] array){
        System.out.println("Бастапқы массив:");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
    public static void reverseArray(int[] array){
        System.out.println("Кері массив:");
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i]+ " ");
        }
    }
}
