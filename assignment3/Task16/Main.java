package Task16;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius: ");
        Sircle sircle = new Sircle(scan.nextDouble());
        System.out.print("Perimeter of circle:");
        sircle.perimeterOfSircle();
        System.out.print("Area of sircle:");
        sircle.areaOfSircle();

        System.out.println("Enter square side length:");
        Square square = new Square(scan.nextDouble());
        System.out.print("Perimeter of sqare:");
        square.perimeterOfSquare();
        System.out.print("Area of square:");
        square.areaOfSquare();
    }
}
class Square{
    private double sideLength;
    public Square(double sideLength){
        this.sideLength = sideLength;
    }
    public void perimeterOfSquare(){
        double p = sideLength * 4;
        System.out.println(p);
    }
    public void areaOfSquare(){
        double s = sideLength * sideLength;
        System.out.println(s);
    }

}
class Sircle{
    private double radius;
    public Sircle(double radius){
        this.radius = radius;
    }
    public void perimeterOfSircle(){
        double c = 2 * 3.14 * radius;
        System.out.println(c);
    }
    public void areaOfSircle(){
        double s = 3.14 * radius * radius;
        System.out.println(s);
    }
}
