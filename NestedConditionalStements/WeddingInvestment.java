package NestedConditionalStements;

import java.util.Scanner;

public class WeddingInvestment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String term = scan.nextLine();
        String contract = scan.nextLine();
        String dessert = scan.nextLine();
        int months = Integer.parseInt(scan.nextLine());
        double price = 0;

        if (term.equals("one")) {
            if (contract.equals("Small")) {
                price = 9.98;
            } else if (contract.equals("Medium")) {
                price = 18.99;
            } else if (contract.equals("Large")) {
                price = 25.98;
            } else if (contract.equals("ExtraLarge")) {
                price = 35.99;
            }
        } else if (term.equals("two")) {
            if (contract.equals("Small")) {
                price = 8.58;
            } else if (contract.equals("Medium")) {
                price = 17.09;
            } else if (contract.equals("Large")) {
                price = 23.59;
            } else if (contract.equals("ExtraLarge")) {
                price = 31.79;
            }
        }

        if (dessert.equals("yes")) {
            if (contract.equals("Small")) {
                price += 5.50;
            } else if (contract.equals("Medium")) {
                price += 4.35;
            } else if (contract.equals("Large")) {
                price += 4.35;
            } else if (contract.equals("ExtraLarge")) {
                price += 3.85;
            }
        }

        if (term.equals("two")) {
            price *= .9625;
        }

        double totalPrice = price * months;
        System.out.printf("%.2f lv.", totalPrice);
    }
}
