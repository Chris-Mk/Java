package NestedLoops;

import java.util.Scanner;

public class Increasing4Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int counter = 0;

        for (int i = a; i <= b; i++) {
            for (int j = i + 1; j < b; j++) {
                for (int k = j + 1; k <= b; k++) {
                    for (int l = k + 1; l <= b; l++) {
                        System.out.printf("%d %d %d %d%n", i, j, k, l);
                        counter++;
                    }
                }
            }
        }
        if (counter == 0) {
            System.out.println("No");
        }
    }
}
