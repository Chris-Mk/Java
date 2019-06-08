package NestedConditionalStements;

import java.util.Scanner;

public class ComputerRoom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int hoursSpent = Integer.parseInt(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();
        boolean isSpring = month.equals("march") || month.equals("april") || month.equals("may");
        boolean isSummer = month.equals("june") || month.equals("july") || month.equals("august");

        double costPerPerson = 0.0d;
        double totalCost = 0.0d;
        double cost;

        if (isSpring && time.equals("day")) {
            if (people >= 4 && hoursSpent >= 5) {
                cost = 10.50 * .90;
                costPerPerson = cost * .50;
                totalCost = costPerPerson * people * hoursSpent;
            } else if (people >= 4) {
                costPerPerson = 10.50 * .90;
                totalCost = costPerPerson * people * hoursSpent;
            } else if (hoursSpent >= 5) {
                costPerPerson = 10.50 * .50;
                totalCost = costPerPerson * people * hoursSpent;
            } else {
                costPerPerson = 10.50;
                totalCost = costPerPerson * people * hoursSpent;
            }
        } else if (isSpring && time.equals("night")) {
            if (people >= 4 && hoursSpent >= 5) {
                cost = 8.40 * .90;
                costPerPerson = cost * .50;
                totalCost = costPerPerson * people * hoursSpent;
            } else if (people >= 4) {
                costPerPerson = 8.40 * .90;
                totalCost = costPerPerson * people * hoursSpent;
            } else if (hoursSpent >= 5) {
                costPerPerson = 8.40 * .50;
                totalCost = costPerPerson * people * hoursSpent;
            } else {
                costPerPerson = 8.40;
                totalCost = costPerPerson * people * hoursSpent;
            }
        }

        if (isSummer && time.equals("day")) {
            if (people >= 4 && hoursSpent >= 5) {
                cost = 12.60 * .90;
                costPerPerson = cost * .50;
                totalCost = costPerPerson * people * hoursSpent;
            } else if (people >= 4) {
                costPerPerson = 12.60 * .90;
                totalCost = costPerPerson * people * hoursSpent;
            } else if (hoursSpent >= 5) {
                costPerPerson = 12.60 * .50;
                totalCost = costPerPerson * people * hoursSpent;
            } else {
                costPerPerson = 12.60;
                totalCost = costPerPerson * people * hoursSpent;
            }
        } else if (isSummer && time.equals("night")) {
            if (people >= 4 && hoursSpent >= 5) {
                cost = 10.20 * .90;
                costPerPerson = cost * .50;
                totalCost = costPerPerson * people * hoursSpent;
            } else if (people >= 4) {
                costPerPerson = 10.20 * .90;
                totalCost = costPerPerson * people * hoursSpent;
            } else if (hoursSpent >= 5) {
                costPerPerson = 10.20 * .50;
                totalCost = costPerPerson * people * hoursSpent;
            } else {
                costPerPerson = 10.20;
                totalCost = costPerPerson * people * hoursSpent;
            }
        }
        System.out.printf("Price per person for one hour: %.2f%n", costPerPerson);
        System.out.printf("Total cost of the visit: %.2f", totalCost);
    }
}
