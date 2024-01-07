package Task8;

public class Skyscraper {
    private int floorsCount;
    private String developer;
    public Skyscraper(int floorsCount, String developer){
        System.out.println("The skyscraper is at the planning stage. Number of floors -"+ floorsCount+ ", developer- "+ developer);
    }
    public Skyscraper(){
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
        System.out.println("The skyscraper is just starting to be built. Number of floors -"+ floorsCount+ ", developer- "+ developer);
    }
}
class Main{
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, " Unknown ");
    }
}
