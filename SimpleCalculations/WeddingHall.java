package SimpleCalculations;

import java.util.Scanner;

public class WeddingHall {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double sqBar = Double.parseDouble(scan.nextLine());
        
        double hallArea = length * width;
        double barArea = sqBar * sqBar;
        double danceFloorArea = hallArea * .19;
        double freeArea = hallArea - barArea - danceFloorArea;
        double people = freeArea / 3.2;

        System.out.printf("%.0f", Math.ceil(people));
    }
}
