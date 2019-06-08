import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        getOrderPrice(product, quantity);
    }

    static void getOrderPrice(String product, double quantity) {
        double totalPrice = 0;

        switch (product) {
            case "coffee":
                totalPrice = 1.50;
                break;
            case "water":
                totalPrice = 1.00;
                break;
            case "coke":
                totalPrice = 1.40;
                break;
            case "snacks":
                totalPrice = 2.00;
                break;
        }

        System.out.printf("%.2f", totalPrice * quantity);
    }
}
