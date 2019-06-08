package ForLoops;

import java.util.Scanner;

public class GoogleSearches {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int users = Integer.parseInt(scan.nextLine());
        double moneyPerSearch = Double.parseDouble(scan.nextLine());

        double totalMoneyMade = 0d;

        for (int i = 1; i <= users; i++) {
            int words = Integer.parseInt(scan.nextLine());
            double moneyFromSingleUser = moneyPerSearch;

            if (words > 5) {
                continue;
            }

            if (words == 1) {
                moneyFromSingleUser *= 2;
            }

            if (i % 3 == 0) {
                moneyFromSingleUser *= 3;
            }

            totalMoneyMade += moneyFromSingleUser;
        }

        System.out.printf("Total money earned for %d days: %.2f", days, totalMoneyMade * days);
    }
}
