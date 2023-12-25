package assignment2;
public class SolutionTask2 {
    public static String array[]= new String[5];
    public static void main(String[] args) {
        for(int i=0; i<5;i++){
            if(i%2==0){
                array[i]="Even";
            }
            else{
                array[i]="Odd";
            }
        }
        for(int i=0; i<5; i++){
            System.out.print(array[i]+", ");
        }
    }
}