import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateTriangleArea {
    private static double getTriangleArea(double height, double base) {
        return base * height * .5;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.#########");
        double h = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double area = getTriangleArea(h, b);

        System.out.println(format.format(area));
    }
}
