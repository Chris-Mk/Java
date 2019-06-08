package NestedLoops;

import java.util.Scanner;

public class UniquePINCodes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstUpperLimit = Integer.parseInt(scan.nextLine());
        int secondUpperLimit = Integer.parseInt(scan.nextLine());
        int thirdUpperLimit = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= firstUpperLimit; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= secondUpperLimit; j++) {
                    if (j == 1 || j == 4 || j == 6 || j == 8 || j == 9) {
                        continue;
                    }
                    for (int k = 1; k <= thirdUpperLimit ; k++) {
                        if (k % 2 == 0) {
                            System.out.println("" + i + " " + j + " " + k);
                        }
                    }
                }
            }
        }
    }
}
