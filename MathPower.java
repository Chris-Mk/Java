import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    private static double getPower(double number, double degree) {
        double temp = 1;
        for (int i = 0; i < degree; i++) {
            temp *= number;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dp = new DecimalFormat("#.#########");

        double num = Double.parseDouble(scan.nextLine());
        double deg = Double.parseDouble(scan.nextLine());
        double result = getPower(num, deg);

        System.out.println(dp.format(result));
    }
}
