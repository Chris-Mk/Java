package ConditionalStatements;

import java.util.Scanner;

public class WeddingParty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int guests = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        int totalFoodCost = guests * 20;

        if (budget >= totalFoodCost) {
            int remainingMoney = budget - totalFoodCost;
            double fireworks = Math.round(remainingMoney * .40);
            double donation = Math.round(remainingMoney - fireworks);
            System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.", fireworks, donation);
        } else {
            System.out.printf("They won't have enough money to pay the covert. They will need %d lv more.", Math.round(totalFoodCost - budget));
        }
    }
}
