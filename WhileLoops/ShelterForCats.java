package WhileLoops;

import java.util.Scanner;

public class ShelterForCats {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int kgPresent = Integer.parseInt(scan.nextLine());
        int gramsPresent = kgPresent * 1000;
        String command = scan.nextLine();
        int totalGramsEaten = 0;

        while (!command.equals("Adopted")) {
            int kgPerMeal = Integer.parseInt(command);
            totalGramsEaten+= kgPerMeal;
            command = scan.nextLine();
        }

        double gramDiff = Math.abs(gramsPresent - totalGramsEaten);
        if (gramsPresent >= totalGramsEaten) {
            System.out.printf("Food is enough! Leftovers: %.0f grams.", gramDiff);
        } else {
            System.out.printf("Food is not enough. You need %.0f grams more.", gramDiff);
        }
    }
}
