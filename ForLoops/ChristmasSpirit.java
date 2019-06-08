package ForLoops;

import java.util.Scanner;

public class ChristmasSpirit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int quantity = Integer.parseInt(scan.nextLine());
        int daysToChristmas = Integer.parseInt(scan.nextLine());
        int totalCost = 0, christmasSpirit = 0;

        for (int i = 1; i <= daysToChristmas; i++) {
            if (i % 11 == 0) {
                quantity += 2;
            }

            if (i % 2 == 0) {
                totalCost += quantity * 2;
                christmasSpirit += 5;
            }

            if (i % 3 == 0) {
                totalCost += quantity * 5 + quantity * 3;
                christmasSpirit += 13;
            }

            if (i % 5 == 0) {
                totalCost += quantity * 15;
                christmasSpirit += 17;
                if (i % 3 == 0) {
                    christmasSpirit += 30;
                }
            }

            if (i % 10 == 0) {
                christmasSpirit -= 20;
                totalCost += 23;
                if (i == daysToChristmas) {
                    christmasSpirit -= 30;
                }
            }
        }

        System.out.printf("Total cost: %d\nTotal spirit: %d", totalCost, christmasSpirit);
    }
}
