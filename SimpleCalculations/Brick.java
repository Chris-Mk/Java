package SimpleCalculations;

import java.util.Scanner;

public class Brick {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bricks = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        int trolleyCapacity = Integer.parseInt(scan.nextLine());

        int bricksPerTrip = workers * trolleyCapacity;
        double totalTrips = Math.ceil((double) bricks / bricksPerTrip);

        System.out.println(totalTrips);
    }
}
