package ConditionalStatements;

import java.util.Scanner;

public class Sums3Numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int sum, smallerNum, largerNum;

        if (num1 + num2 == num3) {
            getSums(num1, num2, num3);
        } else if (num1 + num3 == num2) {
            getSums(num1, num3, num2);
        } else if (num2 + num3 == num1) {
            getSums(num2, num3, num1);
        } else {
            System.out.println("No");
        }
    }

    private static void getSums(int num1, int num2, int num3) {
        int sum;
        int smallerNum;
        int largerNum;
        sum = num3;
        smallerNum = Math.min(num1, num2);
        largerNum = Math.max(num1, num2);
        System.out.printf("%d + %d = %d", smallerNum, largerNum, sum);
    }
}
