import java.util.Scanner;

public class TailoringWorkshop {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);

        int tables = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double sqTables = tables * (length + 2 * 0.30) * (width + 2 * 0.30);
        double sqCarriage = tables * (length / 2) * (length / 2);

        double USD = sqTables * 7 + sqCarriage * 9;
        double BGN = USD * 1.85;

        System.out.printf("%.2f USD%n", USD);
        System.out.printf("%.2f BGN", BGN);
    }
}
