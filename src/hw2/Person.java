package hw2;

public class Person {
    String fullName;
    int age;
    public void talk(){
        System.out.println(fullName +" with age "+ age+ " is talking.");
    }
    public void move(){
        System.out.println(fullName+ " is moving.");
    }
    public Person(){
        this.fullName="белгісіз";
        this.age=0;
    }
    public Person(String fullName, int age){
        this.fullName= fullName;
        this.age= age;
    }
}
