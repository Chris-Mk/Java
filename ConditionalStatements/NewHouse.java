import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flowerType = scan.nextLine();
        int numOfFlowers = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());

        double cost = 0.0d;

        if (flowerType.equals("Roses")) {
            cost = numOfFlowers * 5.00;
            if (numOfFlowers > 80) {
                cost = cost * .90;
            }
        } else if (flowerType.equals("Dahlias")) {
            cost = numOfFlowers * 3.80;
            if (numOfFlowers > 90) {
                cost = cost * .85;
            }
        } else if (flowerType.equals("Tulips")) {
            cost = numOfFlowers *2.80;
            if (numOfFlowers > 80) {
                cost = cost * .85;
            }
        } else if (flowerType.equals("Narcissus")) {
            cost = numOfFlowers * 3.00;
            if (numOfFlowers < 120) {
                cost = cost * 1.15;
            }
        } else if (flowerType.equals("Gladiolus")) {
            cost = numOfFlowers * 2.50;
            if (numOfFlowers < 80) {
                cost = cost * 1.20;
            }
        }

        if (budget >= cost) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numOfFlowers, flowerType, budget - cost);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", cost - budget);
        }
    }
}