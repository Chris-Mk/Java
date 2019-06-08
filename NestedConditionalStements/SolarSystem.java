package NestedConditionalStements;

import java.util.Scanner;

public class SolarSystem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String planet = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double distanceTravelled, totalDays;

        if (planet.equals("Mercury")) {
            distanceTravelled = 2 * .61;
            if (days <= 7) {
                totalDays = 2 * (226 * .61) + days;
                System.out.printf("%.2f%n", distanceTravelled);
                System.out.printf("%.2f", totalDays);
            } else {
                System.out.println("Invalid number of days!");
            }
        } else if (planet.equals("Venus")) {
            distanceTravelled = 2 * .28;
            if (days <= 14) {
                totalDays = 2 * (226 * .28) + days;
                System.out.printf("%.2f%n", distanceTravelled);
                System.out.printf("%.2f", totalDays);
            } else {
                System.out.println("Invalid number of days!");
            }
        } else if (planet.equals("Mars")) {
            distanceTravelled = 2 * .52;
            if (days <= 20) {
                totalDays = 2 * (226 * .52) + days;
                System.out.printf("%.2f%n", distanceTravelled);
                System.out.printf("%.2f", totalDays);
            } else {
                System.out.println("Invalid number of days!");
            }
        } else if (planet.equals("Jupiter")) {
            distanceTravelled = 2 * 4.2;
            if (days <= 5) {
                totalDays = 2 * (226 * 4.2) + days;
                System.out.printf("%.2f%n", distanceTravelled);
                System.out.printf("%.2f", totalDays);
            } else {
                System.out.println("Invalid number of days!");
            }
        }else if (planet.equals("Saturn")) {
            distanceTravelled = 2 * 8.52;
            if (days <= 3) {
                totalDays = 2 * (226 * 8.52) + days;
                System.out.printf("%.2f%n", distanceTravelled);
                System.out.printf("%.2f", totalDays);
            } else {
                System.out.println("Invalid number of days!");
            }
        }else if (planet.equals("Uranus")) {
            distanceTravelled = 2 * 18.21;
            if (days <= 3) {
                totalDays = 2 * (226 * 18.21) + days;
                System.out.printf("%.2f%n", distanceTravelled);
                System.out.printf("%.2f", totalDays);
            } else {
                System.out.println("Invalid number of days!");
            }
        } else if (planet.equals("Neptune")) {
            distanceTravelled = 2 * 29.09;
            if (days <= 2) {
                totalDays = 2 * (226 * 29.09) + days;
                System.out.printf("%.2f%n", distanceTravelled);
                System.out.printf("%.2f", totalDays);
            } else {
                System.out.println("Invalid number of days!");
            }
        } else {
            System.out.println("Invalid planet name!");
        }
    }
}
