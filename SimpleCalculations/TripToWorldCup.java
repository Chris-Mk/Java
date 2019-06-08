package SimpleCalculations;

import java.util.Scanner;

public class TripToWorldCup {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double goTicket = Double.parseDouble(console.nextLine());
        double returnTicket = Double.parseDouble(console.nextLine());
        double ticketPerMatch= Double.parseDouble(console.nextLine());
        int numOfMatches = Integer.parseInt(console.nextLine());
        int percentageDiscount = Integer.parseInt(console.nextLine());

        double transportCost = (goTicket + returnTicket) * 6;
        double afterDiscount = transportCost - transportCost * percentageDiscount/100;
        double ticketCost = ticketPerMatch * numOfMatches * 6;
        double totalExpenditure = afterDiscount + ticketCost;
        double costPerIndividual = totalExpenditure / 6;
        System.out.printf("Total sum: %.2f lv.%nEach friend has to pay %.2f lv.", totalExpenditure, costPerIndividual);
    }
}