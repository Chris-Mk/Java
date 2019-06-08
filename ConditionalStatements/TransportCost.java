import java.util.Scanner;

public class TransportCost {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        double price = 0.0d;
        double taxiRate = 0.0d;

        if (time.equals("day")) {
            taxiRate = .79;
        } else if (time.equals("night")) {
            taxiRate = .90;
        }

        if (km < 20) {
            price = .70 + (km * taxiRate);
        } else if (km < 100) {
            price = km * .09;
        } else {
            price = .06 * km;
        }
        System.out.println(price);
    }
}
