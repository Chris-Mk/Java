import java.util.Scanner;

public class PrimeNumbersBtnNAndM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = Integer.parseInt(scan.nextLine());
        System.out.print("m = ");
        int m = Integer.parseInt(scan.nextLine());

        for (int num = n; num <= m; num++) {
            boolean isPrime = true;
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
                System.out.printf("%d  ", num);
            }
        }
    }
}
