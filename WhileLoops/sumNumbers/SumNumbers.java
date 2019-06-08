package sumNumbers;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int numbers = Integer.parseInt(scan.nextLine());
        int sum = 0;
        System.out.println("Enter the numbers: ");

        while (numbers > 0) {
            int num = Integer.parseInt(scan.nextLine());
            sum += num;
            numbers--;
        }
        System.out.println(sum);
    }
}
