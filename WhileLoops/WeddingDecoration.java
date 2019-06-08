package WhileLoops;

import java.util.Scanner;

public class WeddingDecoration {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double totalCost = 0;
        int balloons = 0, flowers = 0, candles = 0, ribbons = 0;

        while (totalCost <= budget) {
            String product = scan.nextLine();

            if (product.equals("stop")) {
                break;
            } else {
                int quantity = Integer.parseInt(scan.nextLine());
                double cost;
                switch (product) {
                    case "balloons":
                        cost = quantity * 0.1;
                        totalCost += cost;
                        balloons += quantity;
                        break;
                    case "flowers":
                        cost = quantity * 1.5;
                        totalCost += cost;
                        flowers += quantity;
                        break;
                    case "candles":
                        cost = quantity * 0.5;
                        totalCost += cost;
                        candles += quantity;
                        break;
                    case "ribbon":
                        cost = quantity * 2;
                        totalCost += cost;
                        ribbons += quantity;
                        break;
                }
            }
        }

        if (totalCost >= budget) {
            System.out.println("All money is spent!");
        } else {
            System.out.printf("Spend money: %.2f%nMoney left: %.2f%n", totalCost, budget - totalCost);
        }
        System.out.printf("Purchased decoration is %d balloons, %d m ribbon, %d flowers and %d candles.%n", balloons, ribbons, flowers, candles);
    }
}
