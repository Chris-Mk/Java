package SimpleCalculations;

import java.util.Scanner;

public class StadiumIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sectors = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());
        double costPerTicket = Double.parseDouble(scan.nextLine());

        double totalIncome = capacity * costPerTicket;
        double sectorIncome = totalIncome / sectors;
        double charityIncome = (totalIncome - (.75 *sectorIncome))/8;

        System.out.printf("Total income - %.2f BGN%nMoney for charity - %.2f BGN", totalIncome, charityIncome);

    }
}
