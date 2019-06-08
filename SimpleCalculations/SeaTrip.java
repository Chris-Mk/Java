package SimpleCalculations;

import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double food = Double.parseDouble(scan.nextLine());
        double souvenirs = Double.parseDouble(scan.nextLine());
        double hotel = Double.parseDouble(scan.nextLine());

        double fuelNeeded = (420 * 7) / 100.0;
        double totalFuelCost = fuelNeeded * 1.85;
        double foodCost = food * 3, souvenirsCost = souvenirs * 3;
        double day1 = hotel * .90, day2 = hotel * .85, day3 = hotel * .80;
        double expenditure = foodCost + souvenirsCost + totalFuelCost + day1 + day2 + day3;

        System.out.printf("Money needed: %.2f", expenditure);
    }
}
