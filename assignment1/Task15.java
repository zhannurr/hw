package assignment1;

public class Task15 {
    public static void main(String[] args) {
        int n=0;
        for(int i=0; i<10; i++){
            for(int j=0; j<n; j++){
                System.out.print('8');
                if(n==10){
                    break;
                }
            }
            System.out.println('8');
            n++;
        }
    }
}
