package walking;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean goalReached = false;
        int steps = 0;
        int totalSteps = 0;

        while (steps < 10000) {
            String command = scanner.nextLine();

            if (command.equals("Going home")) {
                command = scanner.nextLine();
                totalSteps += Integer.parseInt(command);

                if (totalSteps >= 10000) {
                    goalReached = true;
                }
                break;
            }
            steps = Integer.parseInt(command);
            totalSteps += Integer.parseInt(command);

            if (totalSteps >= 10000) {
                goalReached = true;
                break;
            }
        }

        if (goalReached) {
            System.out.println("Goal reached! Good job!");
        }
        else {
            System.out.printf("%d more steps to reach goal.", (10000 - totalSteps));
        }
    }
}
