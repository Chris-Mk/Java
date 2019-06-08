package RecursiveMethods;

import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int num = Integer.parseInt(scan.nextLine());

        System.out.printf("%d! = %d", num, factorial(num));
    }

    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
