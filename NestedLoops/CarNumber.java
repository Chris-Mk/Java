package NestedLoops;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int firstDigit = Integer.parseInt(scan.nextLine());
        int lastDigit = Integer.parseInt(scan.nextLine());

        for (int i = firstDigit; i <= lastDigit; i++) {
            for (int j = firstDigit; j <= lastDigit; j++) {
                for (int k = firstDigit; k <= lastDigit; k++) {
                    if ((j + k) % 2 == 0) {
                        for (int l = firstDigit; l <= lastDigit; l++) {
                            if (i > l) {
                                if (i % 2 == 0 && l % 2 != 0) {
                                    System.out.print("" + i + j + k + l + " ");
                                } else if (i % 2 != 0 && l % 2 == 0) {
                                    System.out.print("" + i + j + k + l + " ");
                                }
                            }
                        }

                    }
                }
            }
        }
    }
}
