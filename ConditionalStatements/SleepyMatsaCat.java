import java.util.Scanner;

public class SleepyMatsaCat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int daysOff = Integer.parseInt(input.nextLine());

        int workingDays = 365 - daysOff;
        int annualPlayingTime = ((workingDays * 63) + (daysOff * 127));
        double timeDiff = Math.abs(30000 - annualPlayingTime);
        double hours = timeDiff / 60;
        double mins = timeDiff % 60;

        if (annualPlayingTime > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", Math.floor(hours), Math.floor(mins));
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", Math.floor(hours), Math.floor(mins));
        }
    }
}
