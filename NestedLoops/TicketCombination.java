package NestedLoops;

import java.util.Scanner;

public class TicketCombination {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfCombinations = Integer.parseInt(scan.nextLine());

        int counter = 0;
        for (int i = 1; i <= numberOfCombinations; i++) {
            for (char symbol1 = 'B';  symbol1 <= 'L'; symbol1++) {
                if (symbol1 % 2 == 0) {
                    for (char symbol2 = 'f'; symbol2 >= 'a'; symbol2--) {
                        for (char symbol3 = 'A'; symbol3 <= 'C'; symbol3++) {
                            for (int symbol4 = 1; symbol4 <= 10; symbol4++) {
                                for (int symbol5 = 10; symbol5 >= 1; symbol5--) {
                                    counter++;
                                    if (counter == numberOfCombinations) {
                                        System.out.println("Ticket combination: " + symbol1 + symbol2 + symbol3 + symbol4 + symbol5);
                                        int sum = symbol1 + symbol2 + symbol3 + symbol4 + symbol5;
                                        System.out.printf("Prize: %d lv.%n", sum);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
