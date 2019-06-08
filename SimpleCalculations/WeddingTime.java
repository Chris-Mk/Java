package SimpleCalculations;

import java.util.Scanner;

public class WeddingTime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scan.nextLine());
        double waterLiters = Double.parseDouble(scan.nextLine());
        double wineLiters = Double.parseDouble(scan.nextLine());
        double champagneLiters = Double.parseDouble(scan.nextLine());
        double whiskeyLiters = Double.parseDouble(scan.nextLine());

        double totalWhiskeyCost = whiskeyLiters * whiskeyPrice;
        double champagnePrice = .50 * whiskeyPrice;
        double totalChampagneCost =  champagnePrice * champagneLiters;
        double winePrice = .40 * champagnePrice;
        double totalWineCost = winePrice * wineLiters;
        double waterPrice = .10 * champagnePrice;
        double totalWaterCost = waterPrice * waterLiters;

        double totalCost = totalWhiskeyCost + totalChampagneCost + totalWineCost + totalWaterCost;
        System.out.printf("%.2f%n", totalCost);
    }
}
