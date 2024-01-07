package Task13;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a=");
        float a = scan.nextFloat();
        System.out.print("b=");
        float b = scan.nextFloat();
        System.out.print("c=");
        float c = scan.nextFloat();
        Triangle triangle = new Triangle(a,b,c);
        System.out.print("Perimeter:");
        triangle.perimeter();
        System.out.print("Area:");
        triangle.area();

    }
}

public class Triangle {
    private float side1;
    private float side2;
    private float side3;
    public Triangle(float side1, float side2, float side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public void perimeter(){
        float P = side1 + side2 + side3;
        System.out.println(P);
    }
    public void area(){
        float p = (side1 + side2 + side3)/2;
        float s = p*(p - side1)*(p - side2)*(p - side3);
        System.out.println(Math.sqrt(s));
    }
}
