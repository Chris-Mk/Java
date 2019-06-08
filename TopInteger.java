import java.beans.IntrospectionException;
import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number; i++) {
            if (isSumOfDigitDivisibleBy8(i) && hasOddDigit(i)) {
                System.out.println(i);
            }
        }

    }

    static boolean isSumOfDigitDivisibleBy8(int number) {
        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);

        if (sum % 8 == 0) {
            return true;
        }

        return false;
    }

    static boolean hasOddDigit(int number) {
        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                return true;
            }

            number /= 10;
        }
        return false;
    }
}
