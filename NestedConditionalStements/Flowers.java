package NestedConditionalStements;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int tulips = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        String holiday = scan.nextLine();

        double chrysanthemumsCost, rosesCost, tulipsCost;
        double totalCost = 0;

        if (season.equals("Spring") || season.equals("Summer")) {
            chrysanthemumsCost = chrysanthemums * 2.00;
            rosesCost = roses * 4.10;
            tulipsCost = tulips * 2.50;
            totalCost = getTotalCost(holiday, chrysanthemumsCost, rosesCost, tulipsCost);

            if (tulips > 7) {
                totalCost *= .95;
            }

        } else if (season.equals("Autumn") || season.equals("Winter")) {
            chrysanthemumsCost = chrysanthemums * 3.75;
            rosesCost = roses * 4.50;
            tulipsCost = tulips * 4.15;
            totalCost = getTotalCost(holiday, chrysanthemumsCost, rosesCost, tulipsCost);

            if (roses >= 10) {
                totalCost *= .90;
            }
        }

        if (chrysanthemums + roses + tulips > 20) {
            totalCost *= .80;
        }
        totalCost += 2;
        System.out.println(String.format("%.2f", totalCost));
    }

    private static double getTotalCost(String holiday, double chrysanthemumsCost, double rosesCost, double tulipsCost) {
        double totalCost;
        totalCost = chrysanthemumsCost + rosesCost + tulipsCost;

        if (holiday.equals("Y")) {
            chrysanthemumsCost *= 1.15;
            rosesCost *= 1.15;
            tulipsCost *= 1.15;
            totalCost = chrysanthemumsCost + rosesCost + tulipsCost;
        }
        return totalCost;
    }
}
