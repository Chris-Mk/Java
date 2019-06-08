package ConditionalStatements;

import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double astronautHeight = Double.parseDouble(scan.nextLine());

        double spaceshipVol = width * length * height;
        double roomVol = (astronautHeight + .40) * 4;
        double astronauts = Math.floor(spaceshipVol / roomVol);

        if (astronauts >= 3 && astronauts <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", astronauts);
        } else if (astronauts > 10) {
            System.out.println("The spacecraft is too big.");
        } else {
            System.out.println("The spacecraft is too small.");
        }
    }
}
