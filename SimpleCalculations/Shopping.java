package SimpleCalculations;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int restTime = Integer.parseInt(scan.nextLine());
        double pricePerPeripheral = Double.parseDouble(scan.nextLine());
        double pricePerProgram = Double.parseDouble(scan.nextLine());
        double whiteFrappePrice = Double.parseDouble(scan.nextLine());

        double expenditure = 3 * pricePerPeripheral +  2 * pricePerProgram + whiteFrappePrice;
        double timeDiff = Math.abs(restTime - 15);

        System.out.printf("%.2f%n",expenditure);
        System.out.printf("%.0f",timeDiff);
    }
}
