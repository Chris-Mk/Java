import java.util.Scanner;

public class SumPrimeNonPrime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!command.equals("stop")) {
            int num = Integer.parseInt(command);

            if (num < 0) {
                System.out.println("Number is negative.");
            } else {
                boolean isPrime = num >= 2;
                int divider = 2;
                int maxDivider = (int) Math.sqrt(num);
                while (divider <= maxDivider) {
                    if (num % divider == 0) {
                        isPrime = false;
                        break;
                    }
                    divider++;
                }

                if (isPrime) {
                    primeSum += num;
                } else {
                    nonPrimeSum += num;
                }
            }
            command = scan.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " +primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeSum);
    }
}
