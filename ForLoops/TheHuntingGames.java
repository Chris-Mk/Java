package ForLoops;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int players = Integer.parseInt(scan.nextLine());
        double energy = Double.parseDouble(scan.nextLine());
        double dailyWaterPerPerson = Double.parseDouble(scan.nextLine());
        double dailyFoodPerPerson = Double.parseDouble(scan.nextLine());

        double totalWater = dailyWaterPerPerson * players * days;
        double totalFood = dailyFoodPerPerson * players * days;

        for (int i = 1; i <= days; i++) {
            double energyLoss = Double.parseDouble(scan.nextLine());
            energy -= energyLoss;

            if (energy <= 0) {
                break;
            }

            if (i % 2 == 0) {
                totalWater *= .70;
                energy *= 1.05;
            }

            if (i % 3 == 0) {
                totalFood -= totalFood / players;
                energy *= 1.10;
            }
        }

        if (energy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!\n", energy);
        } else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.\n", totalFood, totalWater);
        }
    }
}
