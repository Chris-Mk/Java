package NestedLoops;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int fD = num / 100, secD = num / 10, sD = secD % 10, tD = num % 10;

        for (int i = 1; i <= tD; i++) {
            for (int j = 1; j <= sD; j++) {
                for (int k = 1; k <= fD; k++) {
                    int prod = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, prod);
                }
            }
        }
    }
}
