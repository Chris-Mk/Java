package ForLoops;

import java.util.Scanner;

public class FamilyHouse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int months = Integer.parseInt(scan.nextLine());
        double sumElectricityBill = 0, sumOthers = 0;

        for (int i = 0; i < months; i++) {
            double electricityBill = Double.parseDouble(scan.nextLine());
            sumElectricityBill += electricityBill;

            sumOthers += (electricityBill + 20 + 15) * .20;
        }

        double sumWaterBill = months * 20, sumInternetBill = months * 15;
        double others = sumOthers + sumElectricityBill + sumInternetBill + sumWaterBill;
        double totalCost = sumElectricityBill + sumWaterBill + sumInternetBill + others;

        System.out.printf("Electricity: %.2f lv%n", sumElectricityBill);
        System.out.printf("Water: %.2f lv%n", sumWaterBill);
        System.out.printf("Internet: %.2f lv%n", sumInternetBill);
        System.out.printf("Other: %.2f lv%n", others);
        System.out.printf("Average: %.2f lv", totalCost / months);
    }
}
