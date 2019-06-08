package ConditionalStatements;

import java.util.Scanner;

public class ChangeTiles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double presentMoney = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double base = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double tileCost = Double.parseDouble(scan.nextLine());
        double masterCost = Double.parseDouble(scan.nextLine());

        double floorArea = width * length;
        double tileArea = (base * height) / 2;
        double tilesNeeded = Math.ceil(floorArea / tileArea) + 5;
        double totalTilesCost = tilesNeeded * tileCost;
        double expenditure = totalTilesCost + masterCost;

        if (presentMoney >= expenditure) {
            System.out.println(String.format("%.2f lv left.", presentMoney - expenditure));
        } else {
            System.out.println(String.format("You'll need %.2f lv more.", expenditure - presentMoney));
        }
    }
}
