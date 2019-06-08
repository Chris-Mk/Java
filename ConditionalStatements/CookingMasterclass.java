package ConditionalStatements;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double flourPrice = Double.parseDouble(scan.nextLine());
        double eggsPrice = Double.parseDouble(scan.nextLine());
        double apronPrice = Double.parseDouble(scan.nextLine());

        double moreAprons = apronPrice * Math.ceil(students * 1.20);
        double flourCost = flourPrice * (students - students / 5);
        double cost = flourCost + students * eggsPrice * 10 + moreAprons;

        if (cost <= budget) {
            System.out.printf("Items purchased for %.2f$.", cost);
        } else {
            System.out.printf("%.2f$ more needed.", cost - budget);
        }

    }
}
