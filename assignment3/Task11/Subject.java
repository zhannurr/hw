package Task11;

public class Subject {
    private String subject;
    private int numberOfHours;
    public void setName(String subjectname){
        subject = subjectname;
    }
    public void setNumber(int subjectnumber){
        numberOfHours = subjectnumber;
    }
    public String getName(){
        return subject;
    }
    public int getNumber(){
        return numberOfHours;
    }

}
class Main {
    public static void main(String[] args) {
        Subject subject1 = new Subject();
        Subject subject2 = new Subject();
        Subject subject3 = new Subject();
        subject1.setName("Math");
        subject1.setNumber(5);
        subject2.setName("ICT");
        subject2.setNumber(4);
        subject3.setName("English");
        subject3.setNumber(3);
        System.out.println("First subject is " + subject1.getName() + ",number of hours is " + subject1.getNumber());
        System.out.println("Second subject is " + subject2.getName() + ",number of hours is " + subject2.getNumber());
        System.out.println("Third subject is " + subject3.getName() + ",number of hours is " + subject3.getNumber());
    }
}
