package ForLoops;

import java.util.Scanner;

public class ComputerFirm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        duplicates(scan);
    }

    static void duplicates(Scanner scan) {
        int computers = Integer.parseInt(scan.nextLine());
        double totalReceivedSales = 0;
        int totalRatings = 0;

        for (int i = 1; i <= computers; i++) {
            int salesAndRating = Integer.parseInt(scan.nextLine());
            int rating = salesAndRating % 10;
            int sales = salesAndRating / 10;
            totalRatings += rating;

            double receivedSales = 0;
            if (rating == 2) {
                receivedSales = 0;
            } else if (rating == 3) {
                receivedSales = sales * .50;
            } else if (rating == 4) {
                receivedSales = sales * .70;
            } else if (rating == 5) {
                receivedSales = sales * .85;
            } else if (rating == 6) {
                receivedSales = sales;
            }
            totalReceivedSales += receivedSales;
        }
        double avgRating = (double) totalRatings / computers;

        System.out.printf("%.2f\n", totalReceivedSales);
        System.out.printf("%.2f", avgRating);
    }
}
