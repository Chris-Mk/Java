package NestedConditionalStements;

import java.util.Scanner;

public class SushiTime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sushiName = scan.nextLine();
        String restaurantName = scan.nextLine();
        int servings = Integer.parseInt(scan.nextLine());
        String order = scan.nextLine();

        double totalSushiCost = 0, totalCost = 0;
        if (restaurantName.equals("Sushi Zone")) {
            if (sushiName.equals("sashimi")) {
                totalSushiCost = servings * 4.99;
            } else if (sushiName.equals("maki")) {
                totalSushiCost = servings * 5.29;
            } else if (sushiName.equals("uramaki")) {
                totalSushiCost = servings * 5.99;
            } else if (sushiName.equals("temaki")) {
                totalSushiCost = servings * 4.29;
            }
        } else if (restaurantName.equals("Sushi Time")) {
            if (sushiName.equals("sashimi")) {
                totalSushiCost = servings * 5.49;
            } else if (sushiName.equals("maki")) {
                totalSushiCost = servings * 4.69;
            } else if (sushiName.equals("uramaki")) {
                totalSushiCost = servings * 4.49;
            } else if (sushiName.equals("temaki")) {
                totalSushiCost = servings * 5.19;
            }
        } else if (restaurantName.equals("Sushi Bar")) {
            if (sushiName.equals("sashimi")) {
                totalSushiCost = servings * 5.25;
            } else if (sushiName.equals("maki")) {
                totalSushiCost = servings * 5.55;
            } else if (sushiName.equals("uramaki")) {
                totalSushiCost = servings * 6.25;
            } else if (sushiName.equals("temaki")) {
                totalSushiCost = servings * 4.75;
            }
        } else if (restaurantName.equals("Asian Pub")) {
            if (sushiName.equals("sashimi")) {
                totalSushiCost = servings * 4.50;
            } else if (sushiName.equals("maki")) {
                totalSushiCost = servings * 4.80;
            } else if (sushiName.equals("uramaki")) {
                totalSushiCost = servings * 5.50;
            } else if (sushiName.equals("temaki")) {
                totalSushiCost = servings * 5.50;
            }
        } else {
            System.out.printf("%s is invalid restaurant!", restaurantName);
            return;
        }

        if (order.equals("Y")) {
            totalCost = totalSushiCost * 1.2;
            System.out.printf("Total price: %.0f lv.", Math.ceil(totalCost));
        } else {
            System.out.printf("Total price: %.0f lv.", Math.ceil(totalSushiCost));
        }
    }
}
