package NestedConditionalStements;

import java.util.Scanner;

public class Honeymoon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String city = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());
        double cost = 0;

        switch (city) {
            case "Cairo":
                cost = (nights * 500) + 600;
                if (nights >= 1 && nights <= 4) {
                    cost = cost * .97;
                } else if (nights <= 9) {
                    cost = cost * .95;
                } else if (nights <= 24) {
                    cost = cost * .90;
                } else if (nights <= 49) {
                    cost = cost * .83;
                } else {
                    cost = cost * .70;
                }
                break;
            case "Paris":
                cost = (nights * 300) + 350;
                if (nights >= 5 && nights <= 9) {
                    cost = cost * .93;
                } else if (nights > 9 && nights <= 24) {
                    cost = cost * .88;
                } else if (nights > 24 && nights <= 49) {
                    cost = cost * .78;
                } else if (nights > 49) {
                    cost = cost * .70;
                }
                break;
            case "Lima":
                cost = (nights * 800) + 850;
                if (nights >= 25 && nights <= 49) {
                    cost = cost * .81;
                } else if (nights > 49) {
                    cost = cost * .70;
                }
                break;
            case "New York":
                cost = (nights * 600) + 650;
                if (nights >= 1 && nights <= 4) {
                    cost = cost * .97;
                } else if (nights <= 9) {
                    cost = cost * .95;
                } else if (nights <= 24) {
                    cost = cost * .88;
                } else if (nights <= 49) {
                    cost = cost * .81;
                } else {
                    cost = cost * .70;
                }
                break;
            case "Tokyo":
                cost = (nights * 700) + 700;
                if (nights >= 10 && nights <= 24) {
                    cost = cost * .88;
                } else if (nights > 24 && nights <= 49) {
                    cost = cost * .83;
                } else if (nights > 49) {
                    cost = cost * .70;
                }
                break;
        }

        if (budget >= cost) {
            System.out.printf("Yes! You have %.2f leva left.", budget - cost);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", cost - budget);
        }
    }
}
