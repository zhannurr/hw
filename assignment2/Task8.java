package assignment2;
//The number 5 has been entered.
//        The numbers entered are 1, 7, 5, 9, 3.
//        We get the following array:
//        [ ]
//        [ ][ ][ ][ ][ ][ ][ ]
//        [ ][ ][ ][ ][ ]
//        [ ][ ][ ][ ][ ][ ][ ][ ][ ]
//        [ ][ ][ ]

import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Массив өлшемі:");
        int n= scan.nextInt();
        int[][] multiArray = new int[n][];
        System.out.println("Массив элементтері:");
        for (int i=0; i< multiArray.length; i++){
            int inp= scan.nextInt();
            multiArray[i]= new int[inp];
        }
        for (int i=0; i<multiArray.length; i++){
            for (int j=0; j<multiArray[i].length; j++){
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
