package hw1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Phone phone1= new Phone("87078886655","iphone",123);
        Phone phone2= new Phone("87782223344", "samsung");
        Phone phone3= new Phone();

        System.out.println("Бірінші телефон-");
        phone1.input();
        System.out.println("Екінші телефон-");
        phone2.input();
        System.out.println("Үшінші телефон-");
        phone3.input();

        Scanner scan = new Scanner(System.in);
        System.out.print("бірінші қоңырау шалушыны енгізіңіз:");
        String caller1= scan.nextLine();
        phone1.receiveCall(caller1);
        System.out.print("екінші қоңырау шалушыны енгізіңіз:");
        String caller2= scan.nextLine();
        phone2.receiveCall(caller2);
        System.out.print("үшінші қоңырау шалушыны енгізіңіз:");
        String caller3= scan.nextLine();
        phone3.receiveCall(caller3);

        phone1.receiveCall(caller1, phone1.getNumber());
        phone2.receiveCall(caller2, phone2.getNumber());

        phone1.sendMessage(phone1.getNumber());

    }

}
