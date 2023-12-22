package assignment1;

public class Task12 {
    public static void main(String[] args) {
        int a=1;
        int sum =0;
        while(a<=100){
            if(a%3==0){
                a++;
                continue;
            }
            else{
                sum+=a;
                a++;
            }
        }
        System.out.println("the sum of all numbers from 1 to 100 inclusive, not divisible by 3:"+sum);
    }
}
