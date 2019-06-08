import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        System.out.println(getProduct(Math.abs(number)));
    }

    static int getProduct(int number) {
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);

        return evenSum * oddSum;
    }

    static int getEvenSum(int number) {
        int evenSum = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            }
            number /= 10;
        }

        return evenSum;
    }

    static int getOddSum(int number) {
        int oddSum = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                oddSum += lastDigit;
            }
            number /= 10;
        }
        return oddSum;
    }
}
