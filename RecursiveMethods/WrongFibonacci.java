package RecursiveMethods;

import java.util.Scanner;

public class WrongFibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = Integer.parseInt(scan.nextLine());

        System.out.printf("F%d = %d\n", n, fib(n));
    }

    private static long fib(int n) {
        if (n <= 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
