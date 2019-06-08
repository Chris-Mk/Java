import java.util.Scanner;

public class Logistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int load = Integer.parseInt(scan.nextLine());
        int totalTonnes = 0;
        int busCost = 0;
        int truckCost = 0;
        int trainCost = 0;

        int busTonnes = 0;
        int truckTonnes = 0;
        int trainTonnes = 0;

        for (int i = 0; i < load; i++) {
            int tonnes = Integer.parseInt(scan.nextLine());
            totalTonnes += tonnes;

            if (tonnes <= 3) {
                busTonnes += tonnes;
                busCost += 200 * tonnes;

            } else if (tonnes > 3 && tonnes <= 11) {
                truckTonnes += tonnes;
                truckCost += 175 * tonnes;

            } else if (tonnes > 11) {
                trainTonnes += tonnes;
                trainCost += 120 * tonnes;
            }
        }
        int sum = busCost + truckCost + trainCost;
        double avgCostPerTonne = (double) sum / totalTonnes;

        double busPercent = busTonnes * 100.0 / totalTonnes;
        double truckPercent = truckTonnes * 100.0 / totalTonnes;
        double trainPercent = trainTonnes * 100.0 / totalTonnes;

        System.out.printf("%.2f%n", avgCostPerTonne);
        System.out.printf("%.2f%%%n", busPercent);
        System.out.printf("%.2f%%%n", truckPercent);
        System.out.printf("%.2f%%%n", trainPercent);
    }
}
