package Task12;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student1 = new Student("Zhannur", 18, 3.25);
        System.out.println("Student info:");
        student1.print();
        System.out.println("Enter new GPA:");
        student1.updateGPA(scan.nextDouble());
        System.out.println("Updated student info:");
        student1.print2();
    }
}
public class Student {
    private String studentName;
    private int studentAge;
    private double studentGPA;
    private double studentNewGPA;

    public Student(String studentName, int studentAge, double studentGPA){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGPA = studentGPA;
    }
    public void print(){
        System.out.println("Student name: " + studentName);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student GPA:" + studentGPA);
    }
    public void updateGPA(double newGPA){
        if (newGPA>=0 && newGPA<=4.0){
            this.studentNewGPA = newGPA;

        }
        else{
            System.out.println("Enter correct GPA!");
        }
    }
    public void print2(){
        System.out.println("Student name: " + studentName);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student GPA:" + studentNewGPA);
    }

}



