import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        double sum = 0;

        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5
                    || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            command = scan.nextLine();
        }

        String product = scan.nextLine();
        while (!product.equals("End")) {

            switch (product) {
                case "Nuts":
                    if (sum >= 2.0) {
                        sum -= 2.0;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= .70) {
                        sum -= .70;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.50) {
                        sum -= 1.50;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= .80) {
                        sum -= .80;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1.0) {
                        sum -= 1.0;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            product = scan.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
