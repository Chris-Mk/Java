package WhileLoops;

import java.util.Scanner;

public class SantasCookies {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int totalBoxes = 0;

        while (n-- > 0) {
            int flour = Integer.parseInt(scan.nextLine());
            int sugar = Integer.parseInt(scan.nextLine());
            int cocoa = Integer.parseInt(scan.nextLine());

            int flourCups = flour / 140;
            int sugarSpoons = sugar / 20;
            int cocoaSpoons = cocoa / 10;

            if (flourCups  <= 0 || sugarSpoons  <= 0 || cocoaSpoons <= 0) {
                System.out.println("Ingredients are not enough for a box of cookies.");
            } else {
                int cookiesPerBake = 170 * Math.min(flourCups, Math.min(sugarSpoons, cocoaSpoons)) / 25;
                int batchBoxes = cookiesPerBake / 5;
                totalBoxes += batchBoxes;

                System.out.printf("Boxes of cookies: %d\n", batchBoxes);
            }
        }

        System.out.printf("Total boxes: %d", totalBoxes);
    }
}
