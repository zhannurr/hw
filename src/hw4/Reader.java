package hw4;
import java.util.Scanner;
public class Reader {
    Scanner s= new Scanner(System.in);
    private String fullName;
    private int libCardNumber;
    private String faculty;
    private String birthDate;
    private String phone;
    int takenBooks;

    public Reader(String fullName,int libCardNumber, String faculty, String birthday, String phone, int takenBooks){
        this.fullName = fullName;
        this.faculty = faculty;
        this.phone = phone;
        this.birthDate = birthDate;
        this.libCardNumber = libCardNumber;
        this.takenBooks= takenBooks;
        
    }
    public int getBooks(){
        return takenBooks;
    }

    public String takeBook(){
        String inp= fullName+ " took "+ takenBooks+ " books";
        return inp;
    }
    public String tookBook(){
        String inp= fullName+ " took books ";
        return inp;
    }
    public String returnBook(){
        String inp= fullName+ " returned "+ takenBooks+ " books";
        return inp;
    }
}

