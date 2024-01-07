package Task7;

public class Skyscraper {
    public Skyscraper(){
        System.out.println("The skyscraper has been built.");

    }
    public Skyscraper(int number){
        System.out.println("The skyscraper has been built. Number of floors -"+ number);
    }
    public Skyscraper(String dev){
        System.out.println("The skyscraper has been built. Developer -"+ dev);

    }

}
class Main{
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}
