package Task15;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ATM operation = new ATM();
        operation.setBalance(3000000);
        System.out.println("Your balance: " + operation.getBalance());
        System.out.println("Enter your withdraw: ");
        operation.setWithdraw(scan.nextInt());
        System.out.println("Balance after withdraw: " + operation.getWithdraw());
        System.out.println("Enter your deposit funds: ");
        operation.setDepositFunds(scan.nextInt());
        System.out.println("Balance after withdraw and deposit funds: "+ operation.getDepositFunds());

    }
}
public class ATM {
    private int balance;
    private int withdraw;
    private int depositFunds;


    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    public void setWithdraw(int withdraw){
        this.withdraw = withdraw;
    }
    public int getWithdraw(){
        int afterWithdraw = balance - withdraw;
        return afterWithdraw;
    }

    public void setDepositFunds(int depositFunds){
        this.depositFunds = depositFunds;
    }
    public int getDepositFunds(){
        int afterDepositFunds = getWithdraw() + depositFunds;
        return afterDepositFunds;
    }
}

