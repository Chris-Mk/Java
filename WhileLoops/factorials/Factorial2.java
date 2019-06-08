package factorials;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");

        int n = scan.nextInt();
        long factorial = 1;

        System.out.printf("%d! = ", n);
        do {
            factorial *= n;
            n--;
        } while (n > 0);
        System.out.printf("%d", factorial);
    }
}
