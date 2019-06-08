import java.util.Scanner;

public class BackToThePast {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyInherited = Double.parseDouble(scan.nextLine());
        int year = Integer.parseInt(scan.nextLine());
        double moneyEven = 0;
        double moneyOdd = 0;
        int age = 18;

        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                moneyEven = 12000;
                moneyInherited -= moneyEven;
            } else {
                moneyOdd = (12000 + (50 * age));
                moneyInherited -= moneyOdd;
            }
            age++;
        }

        if (moneyInherited < 0) {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyInherited));
        } else {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyInherited);
        }
    }
}
