import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        double a= scan.nextDouble();
        System.out.println("Enter b:");
        double b = scan.nextDouble();
        universalMethod1(a,b);
        universalMethod2(a,b);
        universalMethod3(a,b);
        universalMethod4(a,b);
        universalMethod5(a,b);
        universalMethod6(a,b);
        universalMethod7(a,b);
        universalMethod8(a,b);
        universalMethod9(a,b);
        universalMethod10(a,b);
    }
    public static void universalMethod1(double a,double b){
        System.out.println("a+b = "+  (a+b));
    }
    public static void universalMethod2(double a,double b){
        System.out.println("b+a = "+ ( b+a));
    }
    public static void universalMethod3(double a,double b){
        System.out.println("a-b = "+ (a-b));
    }
    public static void universalMethod4(double a,double b){
        System.out.println("b-a = "+ (b-a));
    }
    public static void universalMethod5(double a,double b){
        System.out.println("a*b = "+ a*b);
    }
    public static void universalMethod6(double a,double b){
        System.out.println("b*a = "+ b*a);
    }
    public static void universalMethod7(double a,double b){
        System.out.println("a/b = "+ a/b);
    }
    public static void universalMethod8(double a,double b){
        System.out.println("b/a = "+ b/a);
    }
    public static void universalMethod9(double a,double b){
        System.out.println("a div b = "+ a%b);
    }
    public static void universalMethod10(double a,double b){
        System.out.println("b div a = "+ b%a);
    }

}
