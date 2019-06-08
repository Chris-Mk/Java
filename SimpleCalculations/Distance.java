package SimpleCalculations;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int initialVelocity = Integer.parseInt(scan.nextLine());
        int fMins = Integer.parseInt(scan.nextLine());
        int sMins = Integer.parseInt(scan.nextLine());
        int tMins = Integer.parseInt(scan.nextLine());

        double distance1 = initialVelocity * fMins/60.0;
        double velocity2 = initialVelocity * 1.10;
        double distance2 = velocity2 * sMins/60.0;
        double velocity3 = velocity2 * .95;
        double distance3 = velocity3 * tMins/60.0;
        double totalDistance = distance1 + distance2 + distance3;

        System.out.println(String.format("%.2f", totalDistance));
    }
}
