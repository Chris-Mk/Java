import java.util.Scanner;

public class OddEvenSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the numbers:");
        int oddSum = 0;
        int evenSum = 0;

        while (n > 0) {
            int num = Integer.parseInt(scan.nextLine());

            if (n % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            n--;
        }

        if (evenSum == oddSum) {
            System.out.printf("Yes%nSum = %d", evenSum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(evenSum - oddSum));
        }
    }
}
