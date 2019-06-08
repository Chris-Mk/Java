package ConditionalStatements;

import java.util.Scanner;

public class GoingHome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int distance = Integer.parseInt(scan.nextLine());
        int gasLitersPer100km = Integer.parseInt(scan.nextLine());
        double gasPricePerLiter = Double.parseDouble(scan.nextLine());
        double moneyEarned = Double.parseDouble(scan.nextLine());

        double requiredLiters = distance * gasLitersPer100km / 100.0;
        double totalGasCost = requiredLiters * gasPricePerLiter;

        if (totalGasCost > moneyEarned) {
            System.out.printf("Sorry, you cannot go home. Each will receive %.2f money.", moneyEarned / 5.0);
        } else {
            System.out.printf("You can go home. %.2f money left.", moneyEarned - totalGasCost);
        }
    }
}
