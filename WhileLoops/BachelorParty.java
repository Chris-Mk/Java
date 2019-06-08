package WhileLoops;

import java.util.Scanner;

public class BachelorParty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int artistPrice = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();;
        int totalPrice = 0, totalGuest = 0;

        while (!command.equals("The restaurant is full")) {
            int peopleInAGroup = Integer.parseInt(command);
            totalGuest += peopleInAGroup;

            int price = 0;
            if (peopleInAGroup < 5) {
                price = peopleInAGroup * 100;
            } else if (peopleInAGroup >= 5) {
                price = peopleInAGroup * 70;
            }
            totalPrice += price;
            command = scan.nextLine();
        }

        if (totalPrice >= artistPrice) {
            System.out.printf("You have %d guests and %d leva left.", totalGuest, totalPrice - artistPrice);
        } else {
            System.out.printf("You have %d guests and %d leva income, but no singer.", totalGuest, totalPrice);
        }
    }
}
