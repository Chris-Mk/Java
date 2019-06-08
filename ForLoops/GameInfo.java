package ForLoops;

import java.util.Scanner;

public class GameInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String teamName = scan.nextLine();
        int numOfMatches = Integer.parseInt(scan.nextLine());
        int extraTime = 0;
        int penalties = 0;
        int totalMinutes = 0;

        for (int i = 0; i < numOfMatches; i++) {
            int durationPerMatch = Integer.parseInt(scan.nextLine());
            totalMinutes += durationPerMatch;

            if (durationPerMatch > 90 && durationPerMatch <= 120) {
                extraTime++;
            } else if (durationPerMatch > 120) {
                penalties++;
            }
        }

        double avgMins = (double) totalMinutes / numOfMatches;
        System.out.printf("%s has played %d minutes. Average minutes per game: %.2f%n", teamName, totalMinutes, avgMins);
        System.out.printf("Games with penalties: %d%n", penalties);
        System.out.printf("Games with additional time: %d", extraTime);

    }
}
