import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int areaX = Integer.parseInt(console.nextLine());
        double grapesY = Double.parseDouble(console.nextLine());
        int litersZ = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());

        double wineArea = areaX * .4;
        double grapesKg = wineArea * grapesY;
        double litres = grapesKg / 2.5;
        double diff = Math.abs(litersZ - litres);
        double lpp = diff / workers;

        if (litres < litersZ) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(diff));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person.", Math.floor(litres), Math.ceil(diff), Math.ceil(lpp));
        }
    }
}
