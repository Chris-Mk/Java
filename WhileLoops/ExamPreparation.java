import java.util.Scanner;

public class ExamPreparation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int unsatisfactory = Integer.parseInt(scan.nextLine());
        double sum = 0;
        int counter = 0;
        int lowGrades = 0;
        String taskName = "";

        while (lowGrades != unsatisfactory) {
            String command = scan.nextLine();

            if (!command.equals("Enough")) {
                taskName = command;
            } else {
                System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", sum/counter, counter, taskName);
                return;
            }

            int evaluation = Integer.parseInt(scan.nextLine());

            if (evaluation <= 4) {
                lowGrades++;
            }
            sum += evaluation;
            counter++;
        }
        System.out.printf("You need a break, %d poor grades.", lowGrades);
    }
}
