package NestedLoops;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());
        int p1Limit = Integer.parseInt(scan.nextLine());
        int p2Limit = Integer.parseInt(scan.nextLine());

        for (int i = p1; i <= p1 + p1Limit; i++) {
            double divider = 2;
            double maxDivider = Math.sqrt(i);
            boolean isPrime = true;

            while (divider <= maxDivider) {
                if (i % divider == 0) {
                    isPrime = false;
                }
                divider++;
            }

            if (isPrime) {
                for (int j = p2; j <= p2 + p2Limit; j++) {
                    maxDivider = Math.sqrt(j);
                    divider = 2;
                    isPrime = true;
                    while (divider <= maxDivider) {
                        if (j % divider == 0) {
                            isPrime = false;
                        }
                        divider++;
                    }
                    if (isPrime) {
                        System.out.println("" + i + j);
                    }
                }
            }
        }
    }
}
