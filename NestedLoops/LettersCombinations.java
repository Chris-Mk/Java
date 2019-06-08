package NestedLoops;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char ch1 = scan.next().charAt(0);
        char ch2 = scan.next().charAt(0);
        char ch3 = scan.next().charAt(0);
        int counter = 0;

        for (char i = ch1; i <= ch2; i++) {
            for (char j = ch1; j <= ch2; j++) {
                for (char k = ch1; k <= ch2; k++) {
                    if (i != ch3 && j != ch3 && k != ch3) {
                        System.out.printf("%c%c%c ", i, j ,k);
                        counter++;
                    }
                }
            }
        }
        System.out.printf("%d", counter);
    }
}
