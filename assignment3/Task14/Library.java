package Task14;
import java.util.Scanner;
public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Abai Zholy", "M.Auezov", 1942);
        Book book2 = new Book("Harry Potter", " J. K. Rowling", 1997);
        Book book3 = new Book("Twilight", "S.Meyer",2005);
        book1.addToLib();
        book2.addToLib();
        book3.addToLib();
    }
}
class Book{
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void addToLib(){
        System.out.println("Title: " + title + ",Author: " + author + ",Year: " + year);
    }
}