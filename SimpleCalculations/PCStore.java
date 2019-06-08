package SimpleCalculations;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double $processor = Double.parseDouble(scan.nextLine());
        double $videoCard = Double.parseDouble(scan.nextLine());
        double $RAM = Double.parseDouble(scan.nextLine());
        int RAMCircuits = Integer.parseInt(scan.nextLine());
        double discount = Double.parseDouble(scan.nextLine());

        double BGNProcessor = $processor * 1.57;
        double BGNVideoCard = $videoCard * 1.57;
        double BGNRAM = $RAM * 1.57;
        double processorDiscount = BGNProcessor - (BGNProcessor * discount);
        double videoCardDiscount = BGNVideoCard - (BGNVideoCard * discount);
        double totalRAM = RAMCircuits * BGNRAM;
        double totalBGNCost = processorDiscount + videoCardDiscount + totalRAM;

        System.out.printf("Money needed - %.2f leva.", totalBGNCost);
    }
}
