package ForLoops;

import java.util.Scanner;

public class SpringVacationTrip {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        double fuelPerKm = Double.parseDouble(scan.nextLine());
        double foodPerPersonPerDay = Double.parseDouble(scan.nextLine());
        double roomPricePerPerson = Double.parseDouble(scan.nextLine());

        double totalExpenses = foodPerPersonPerDay * days * people;

        double hotelExpense = roomPricePerPerson * people * days;
        if (people > 10) {
            hotelExpense *= .75;
        }

        totalExpenses += hotelExpense;

        for (int i = 1; i <= days; i++) {
            double distanceTravelled = Double.parseDouble(scan.nextLine());

            totalExpenses += distanceTravelled * fuelPerKm;

            if (i % 3 == 0 || i % 5 == 0) {
                totalExpenses += totalExpenses * .40;
            }

            if (i % 7 == 0) {
                totalExpenses -= totalExpenses / people;
            }

            if (budget - totalExpenses < 0) {
                break;
            }
        }

        if (budget - totalExpenses >= 0) {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - totalExpenses);
        } else {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", totalExpenses - budget);
        }
    }
}
