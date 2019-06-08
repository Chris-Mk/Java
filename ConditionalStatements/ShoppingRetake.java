package ConditionalStatements;

import java.util.Scanner;

public class ShoppingRetake {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int chocolates = Integer.parseInt(scan.nextLine());
        double milks = Double.parseDouble(scan.nextLine());

        double totalChocolates = chocolates * .65;
        double totalMilks = milks * 2.70;
        double mandarins = Math.floor(chocolates * .65);
        double totalMandarins = mandarins * .20;
        double totalCost = totalChocolates + totalMilks + totalMandarins;

        if (budget >= totalCost) {
            System.out.printf("You got this, %.2f money left!", budget - totalCost);
        } else {
            System.out.printf("Not enough money, you need %.2f more!", totalCost - budget);
        }
    }
}
