import java.util.Scanner;

public class CharityCampaign {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int confe = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        int cakeCost = cakes * 45;
        double waffCost= waffles * 5.80;
        double panCost = pancakes * 3.20;
        double dailyCost = (cakeCost + waffCost + panCost) * confe;
        double campCost = dailyCost * days;
        double profit = campCost - campCost/8;

        System.out.printf("%.2f", profit);
    }
}
