import java.util.Scanner;

public class FishingBoat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        int fishermen = Integer.parseInt(scan.nextLine());

        double cost;

        if (season.equals("Spring")) {
            if (fishermen <= 6) {
                cost = 3000 * .90;
            } else if (fishermen <= 11) {
                cost = 3000 * .85;
            } else {
                cost = 3000 * .75;
            }
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            if (fishermen <= 6) {
                cost = 4200 * .90;
            } else if (fishermen <= 11) {
                cost = 4200 * .85;
            } else {
                cost = 4200 * .75;
            }
        } else {
            if (fishermen <= 6) {
                cost = 2600 * .90;
            } else if (fishermen <= 11) {
                cost = 2600 * .85;
            } else {
                cost = 2600 * .75;
            }
        }

        if (fishermen % 2 == 0 && !(season.equals("Autumn"))) {
            cost = cost * .95;
        }

        double diff = Math.abs(budget - cost);
        if (budget >= cost) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}