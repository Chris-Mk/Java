package ConditionalStatements;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double partyCost = Double.parseDouble(scan.nextLine());
        int loveMsg = Integer.parseInt(scan.nextLine());
        int waxRoses = Integer.parseInt(scan.nextLine());
        int keyHolders = Integer.parseInt(scan.nextLine());
        int cartoons = Integer.parseInt(scan.nextLine());
        int luckySurprises = Integer.parseInt(scan.nextLine());

        double loveMsgCost = loveMsg * .60;
        double waxRosesCost = waxRoses * 7.20;
        double keyHolderCost = keyHolders * 3.60;
        double cartoonCost = cartoons * 18.20;
        double luckySurprisesCost = luckySurprises * 22;
        double totalCost = loveMsgCost + waxRosesCost + keyHolderCost + cartoonCost+ luckySurprisesCost;
        totalCost *= .90;
        int totalProducts = loveMsg + waxRoses + keyHolders + cartoons + luckySurprises;

        if (totalProducts >= 25) {
            totalCost *= .65;
        }

        if (totalCost >= partyCost) {
            System.out.printf("Yes! %.2f lv left.", totalCost - partyCost);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", partyCost - totalCost);
        }
    }
}
