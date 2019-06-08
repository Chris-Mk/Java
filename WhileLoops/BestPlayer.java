package WhileLoops;

import java.util.Scanner;

public class BestPlayer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxGoals = 0;
        String playerName;
        String maxPlayer = "";
        int goals;

        while (true) {
            playerName = scanner.nextLine();

            if (playerName.equals("END")) {
                if (maxGoals >= 3) {
                    System.out.println(maxPlayer + " is the best player!");
                    System.out.println("He has scored " + maxGoals + " goals and made a hat-trick !!!");
                } else {
                    System.out.println(maxPlayer + " is the best player!");
                    System.out.println("He has scored " + maxGoals + " goals.");
                }
                return;
            }

            goals = Integer.parseInt(scanner.nextLine());

            if (goals >= 10) {
                break;
            }

            if (goals > maxGoals) {
                maxGoals = goals;
                maxPlayer = playerName;
            }
        }
        System.out.println(playerName + " is the best player!");
        System.out.println("He has scored " + goals + " goals and made a hat-trick !!!");
    }
}