package Task10;

public class Building {
    private String type;
    public Building(String type) {
        this.type = type;
    }
    public void initialize(String type2){
        this.type = type2;
    }
    public void print(){
        System.out.println("Building now: " + type);
    }
}
class Main{
    public static void main(String[] args) {
        Building building = new Building("Ресторан");
        building.initialize("Барбершоп");
        building.print();
    }
}
