package WhileLoops;

import java.util.Scanner;

public class GroupStage {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String teamName = scan.nextLine();
        int matchesPlayed = Integer.parseInt(scan.nextLine());

        int points = 0;
        int totalGoalsScored = 0;
        int totalGoalsAllowed = 0;
        int counter = 0;

        while (counter < matchesPlayed) {
            int goalsScored = Integer.parseInt(scan.nextLine());
            totalGoalsScored += goalsScored;
            int goalsAllowed = Integer.parseInt(scan.nextLine());
            totalGoalsAllowed += goalsAllowed;

            if (goalsScored > goalsAllowed) {
                points += 3;
            } else if (goalsScored == goalsAllowed) {
                points += 1;
            }
            counter++;
        }

        if (totalGoalsScored >= totalGoalsAllowed) {
            System.out.printf("%s has finished the group phase with %d points.%nGoal difference: %d.%n", teamName, points, totalGoalsScored - totalGoalsAllowed);
        } else {
            System.out.printf("%s has been eliminated from the group phase.%nGoal difference: %d.%n", teamName, totalGoalsScored - totalGoalsAllowed);
        }
    }
}
