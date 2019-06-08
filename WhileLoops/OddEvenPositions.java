import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPositions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double oddSum = 0;
        double oddMin = 2000000000;
        double oddMax = -2000000000;
        double evenSum = 0;
        double evenMin = 2000000000;
        double evenMax = -2000000000;

        int i = 1;
        while (i <= n) {
            double num = Double.parseDouble(scan.nextLine());

            if (i % 2 == 0) {
                evenSum += num;
                if (num < evenMin) {
                    evenMin = num;
                }
                if (num > evenMax) {
                    evenMax = num;
                }
            } else {
                oddSum += num;
                if (num < oddMin) {
                    oddMin = num;
                }
                if (num > oddMax) {
                    oddMax = num;
                }
            }
            i++;
        }

        DecimalFormat dp = new DecimalFormat("#.##");

        System.out.println("OddSum=" + dp.format(oddSum));
        if (oddMin == 2000000000) {
            System.out.println("OddMin=No");
        } else {
            System.out.println("OddMin=" + dp.format(oddMin));
        }
        if (oddMax == -2000000000) {
            System.out.println("OddMax=No");
        } else {
            System.out.println("OddMax=" + dp.format(oddMax));
        }

        System.out.println("EvenSum=" + dp.format(evenSum));
        if (evenMin == 2000000000) {
            System.out.println("EvenMin=No");
        } else {
            System.out.println("EvenMin=" + dp.format(evenMin));
        }
        if (evenMax == -2000000000) {
            System.out.println("EvenMax=No");
        } else {
            System.out.println("EvenMax=" + dp.format(evenMax));
        }
    }
}
