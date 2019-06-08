import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] prices = Arrays.stream(scan.nextLine().split(",\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        UnaryOperator<Double> addVAT = price -> price += price * .20;

        System.out.println("Prices with VAT:");
        for (double price : prices) {
            System.out.println(String.format("%.2f", addVAT.apply(price)));
        }

    }
}
