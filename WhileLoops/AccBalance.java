import java.util.Scanner;

public class AccBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double balance = 0;

        int counter = 0;
        while (counter < n) {
            double amt = scan.nextDouble();
            if (amt < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                balance += amt;
                System.out.printf("Increase: %.2f%n", amt);
                counter++;
            }
        }

        System.out.printf("Total: %.2f%n", balance);
    }
}
