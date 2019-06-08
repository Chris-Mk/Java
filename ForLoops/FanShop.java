package ForLoops;

import java.util.Scanner;

public class FanShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int budget = Integer.parseInt(scan.nextLine());
        int objects = Integer.parseInt(scan.nextLine());

        int totalCost = 0;
        for (int i = 0; i < objects; i++) {
            String name = scan.nextLine();

           switch (name) {
               case "hoodie":
                   totalCost += 30;
                   break;
               case "keychain":
                   totalCost += 4;
                   break;
               case "T-shirt":
                   totalCost += 20;
                   break;
               case "flag":
                   totalCost += 15;
                   break;
               case "sticker":
                   totalCost += 1;
                   break;
           }
        }

        if (totalCost <= budget) {
            System.out.printf("You bought %d items and left with %d lv.", objects, budget - totalCost);
        } else {
            System.out.printf("Not enough money, you need %d more lv.", totalCost - budget);
        }
    }
}
