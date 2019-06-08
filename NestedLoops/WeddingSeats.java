package NestedLoops;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String character = scan.nextLine();
        char lastSector = character.charAt(0);
        int rows = Integer.parseInt(scan.nextLine());
        int places = Integer.parseInt(scan.nextLine());
        int counter = 0;

        for (char i = 'A'; i <= lastSector; i++) {
            if (i > 'A') {
                rows++;
                counter = getCounter(rows, places, counter, i);
            } else {
                counter = getCounter(rows, places, counter, i);
            }
        }
        System.out.println(counter);
    }

    private static int getCounter(int rows, int places, int counter, char i) {
        for (int j = 1; j <= rows; j++) {
            if (j % 2 != 0) {
                for (char k = 'a'; k < 'a' + places; k++) {
                    System.out.println("" + i + j + k);
                    counter++;
                }
            }
            if (j % 2 == 0) {
                for (char k = 'a'; k < 'a' + places + 2; k++) {
                    System.out.println("" + i + j + k);
                    counter++;
                }
            }
        }
        return counter;
    }
}
