package WhileLoops;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int emp1 = Integer.parseInt(scan.nextLine());
        int emp2 = Integer.parseInt(scan.nextLine());
        int emp3 = Integer.parseInt(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());

        int hourly = emp1 + emp2 + emp3;
        int hours = 0;

        while (students > 0) {
            hours++;

            if (hours % 4 == 0) {
                continue;
            }

            students -= hourly;
        }

        System.out.println(String.format("Time needed: %dh.", hours));
    }
}
