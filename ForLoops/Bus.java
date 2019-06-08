package ForLoops;

import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int initialPassengers = Integer.parseInt(scan.nextLine());
        int busStops = Integer.parseInt(scan.nextLine());
        int counter= 0;

        for (int i = 1; i <= busStops * 2; i++) {
            int passengers = Integer.parseInt(scan.nextLine());
            counter++;

            if (i % 2 == 0) {
                initialPassengers += passengers;
            } else {
                initialPassengers -= passengers;
            }

            if (counter == 2) {
                initialPassengers += 2;
            } else if (counter == 4) {
                initialPassengers -= 2;
                counter = 0;
            }
        }
        System.out.printf("The final number of passengers is : %d", initialPassengers);
    }
}

