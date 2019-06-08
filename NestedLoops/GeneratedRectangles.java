package NestedLoops;

import java.util.Scanner;

public class GeneratedRectangles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int counter = 0;

        for (int left = -n; left < n; left++) {
            for (int top = -n; top < n; top++) {
                for (int right = left + 1; right <= n; right++) {
                    for (int bottom = top + 1; bottom <= n; bottom++) {
                        int area = Math.abs(left - right) * Math.abs(top - bottom);
                        if (area >= m) {
                            System.out.printf("(%d, %d) (%d, %d) -> %d%n", left, top, right, bottom, area);
                            counter++;
                        }
                    }
                }
            }
        }
        if (counter == 0) {
            System.out.println("No");
        }
    }
}
