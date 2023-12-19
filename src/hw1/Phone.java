package hw1;

public class Phone {
    private String number;
    private String model;
    private int weight;
    public Phone(String number, String model, int weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public Phone() {
        this("", "", 0);
    }
    public void receiveCall(String caller) {
        System.out.println(caller + " is ringing");
    }
    public void receiveCall(String caller,String callernumber) {
        System.out.println(caller+" is calling by number "+ callernumber);
    }
    public void sendMessage(String phoneNumber) {
        System.out.print("Sending message to: " + phoneNumber);
    }

    public String getNumber() {
        return number;
    }
    public void input(){
        System.out.print("номер:"+ number +",");
        System.out.print(" модель:"+model+",");
        System.out.println(" салмақ:"+weight);
    }

}
