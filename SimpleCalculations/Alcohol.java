import java.util.Scanner;

public class Alcohol {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerLts = Double.parseDouble(scanner.nextLine());
        double wineLts = Double.parseDouble(scanner.nextLine());
        double rakiaLts = Double.parseDouble(scanner.nextLine());
        double whiskeyLts = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskeyPrice / 2;
        double winePrice = 0.6 * rakiaPrice;
        double beerPrice = 0.2 * rakiaPrice;

        double totalRakia = rakiaLts *rakiaPrice;
        double totalWine = wineLts * winePrice;
        double totalBeer = beerLts * beerPrice;
        double totalWiskey = whiskeyLts * whiskeyPrice;

        double sum = totalRakia + totalWine + totalBeer + totalWiskey;
        System.out.printf("%.2f", sum);
    }
}
