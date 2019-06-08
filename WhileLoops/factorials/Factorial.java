package factorials;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        long factorial = 1;

        System.out.printf("%d! = ", num);
        while (true) {
            if (num == 1) {
                break;
            }
            factorial *= num;
            num--;
        }
        System.out.printf("%d",factorial);
    }
}
