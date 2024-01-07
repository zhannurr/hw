package Task9;

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;
    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;

    }
    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "orange";
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = 2023;
        this.color = "orange";
    }

    public void print(){
        System.out.println("Manufacturer: "+ manufacturer + ",model: " + model + ",year: " + year + ",color: "+ color);
    }

}
class Main {
    public static void main(String[] args) {
        CarConcern car1 = new CarConcern("Veneno", 2013,"red");
        CarConcern car2 = new CarConcern("Urus", 2018);
        CarConcern car3 = new CarConcern("Miura");
        car1.print();
        car2.print();
        car3.print();
    }

}
