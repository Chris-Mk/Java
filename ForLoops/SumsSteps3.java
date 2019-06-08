package ForLoops;

import java.util.Scanner;

public class SumsSteps3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (i % 3 == 0) {
                sum1 += num;
            } else if (i % 3 == 1) {
                sum2 += num;
            } else if (i % 3 == 2) {
                sum3 += num;
            }
        }
        System.out.println("Sum1 = " + sum1);
        System.out.println("Sum2 = " + sum2);
        System.out.println("Sum3 = " + sum3);
    }
}
