package assignment1;
import java.util.Scanner;
public class Task14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = scanner.nextInt();
        System.out.print("Enter end: ");
        int end = scanner.nextInt();
        System.out.print("Enter multiple: ");
        int multiple = scanner.nextInt();
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple == 0) {
                sum += i;
            }
            if (i % multiple != 0) {
                continue;
            }
        }
        System.out.println(sum);
    }
}
