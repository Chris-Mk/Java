import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scan.nextLine());
        double availableMoney = Double.parseDouble(scan.nextLine());
        int spentCounter = 0;
        int dayCounter = 0;

        while (true) {
            String action = scan.nextLine();
            double amount = Double.parseDouble(scan.nextLine());
            dayCounter++;

            if ("spend".equals(action)) {
                spentCounter++;
                availableMoney -= amount;
                if (amount > availableMoney) {
                    availableMoney = 0;
                }
            } else if ("save".equals(action)) {
                spentCounter = 0;
                availableMoney += amount;
            }

            if (availableMoney >= moneyNeeded) {
                System.out.printf("You saved the money for %d days.", dayCounter);
                return;
            }

            if (spentCounter >= 5) {
                System.out.printf("You can't save the money.%n%d", dayCounter);
                break;
            }
        }
    }
}
