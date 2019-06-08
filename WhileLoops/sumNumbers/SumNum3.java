package sumNumbers;

import java.util.Scanner;

public class SumNum3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to find the sum btn them(inclusive):");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.print("The sum ");
        int sum = 0;

        while (num1 <= num2) {
            System.out.print(num1);
            sum += num1;
            num1++;
            if (num1 <= num2) {
                System.out.print(" + ");
            }
        }
        System.out.printf(" = %d", sum);
    }
}
