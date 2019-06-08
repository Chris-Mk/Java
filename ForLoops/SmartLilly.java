import java.util.Scanner;

public class SmartLilly {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double machinePrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());
        double moneyEven = 0;
        double moneyOdd = 0;
        double bro = 0;
        double savings = 0;

        for (int i = 2; i <= age; i += 2) {
            moneyEven += 10.00;
            savings += moneyEven;
            bro++;
        }

        for (int j = 1; j <= age; j += 2) {
            moneyOdd += toyPrice;
        }

        savings -= bro;
        double sum = savings + moneyOdd;

        if (sum >= machinePrice) {
            System.out.printf("Yes! %.2f", sum - machinePrice);
        } else {
            System.out.printf("No! %.2f", machinePrice - sum);
        }
    }
}