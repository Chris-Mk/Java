package SimpleCalculations;

import java.util.Scanner;

public class DistanceToTheMoon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double speed = Double.parseDouble(scan.nextLine());
        double litersPer100km = Double.parseDouble(scan.nextLine());

        double hours = Math.ceil(((384400 / speed) * 2 )+ 3);
        double fuel = ((384400 * litersPer100km) / 100) * 2;

        System.out.printf("%.0f%n", hours);
        System.out.printf("%.0f", fuel);
    }
}
