package ConditionalStatements;

import java.util.Scanner;

public class BeerAndChips {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameOfFan = scan.nextLine();
        double budget= Double.parseDouble(scan.nextLine());
        int beer = Integer.parseInt(scan.nextLine());
        int chips = Integer.parseInt(scan.nextLine());

        double beerCost = beer * 1.20;
        double chipsCost = beerCost * .45;
        double chipschips = chipsCost * chips;
        double roundedChips = Math.ceil(chipschips);
        double totalCost = beerCost + roundedChips;
        double diff = Math.abs(budget - totalCost);

        if(budget >= totalCost) {
            System.out.printf("%s bought a snack and has %.2f leva left.", nameOfFan, diff);
        } else {
            System.out.printf("%s needs %.2f more leva!", nameOfFan, diff);
        }
    }
}
