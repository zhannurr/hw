package assignment2;
//Create a triangular array where the value of each element is the sum of its indices. For
//example:
//array[7][3] = 7 + 3 = 10,
//array[3][0] = 3 + 0 = 3.
//Display the array as follows:
//        0
//        12
//        2 3 4
//        3 4 5 6
//        4 5 6 7 8
//        5 6 7 8 9 10
//        ...
//The numbers on the line are separated by a space.
//You can define a triangular array as follows:
//int[][] array = new int[10][];
//array[0] = new int[1];
//array[1] = new int[2];
//array[2] = new int[3]
public class Task7 {
    public static void main(String[] args) {
        int n=10;
        int array[][]= new int[n][];
        for (int i=0; i<n; i++){
            array[i]=new int[i+1];
        }
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                array[i][j]=i+j;
            }
        }
        for (int i=0; i< array.length; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
