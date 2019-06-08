import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
         double excursionPrice = Double.parseDouble(scan.nextLine());
         int puzzles = Integer.parseInt(scan.nextLine());
         int puppets = Integer.parseInt(scan.nextLine());
         int bear = Integer.parseInt(scan.nextLine());
         int minions = Integer.parseInt(scan.nextLine());
         int trucks = Integer.parseInt(scan.nextLine());

         int totalToys = puppets + puzzles + bear + minions + trucks;
         double puzzlesCost = puzzles * 2.60, puppetsCost = puppets * 3.00, bearCost = bear * 4.10, minionsCost = minions * 8.20,
                 trucksCost = trucks * 2.00;
         double totalCost = puppetsCost + puzzlesCost + bearCost + minionsCost + trucksCost;
         totalCost *= .90;

        if (totalToys >= 50) {
            totalCost *= .75;
        }

        if (excursionPrice > totalCost) {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - totalCost);
        } else {
            System.out.printf("Yes! %.2f lv left.", totalCost - excursionPrice);
        }
    }
}
