package walking;

import java.util.Scanner;

public class Walking2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int steps = 0;
        while (steps < 10000) {
            String command = scan.nextLine();

            if (command.equals("Going home")) {
                steps += Integer.parseInt(scan.nextLine());
                break;
            } else {
                steps += Integer.parseInt(command);
            }
        }

        if (steps >= 10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.println((10000 - steps) + " more steps to reach goal.");
        }
    }
}
