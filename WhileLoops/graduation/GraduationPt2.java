package graduation;

import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double sum = 0;
        int torn = 0;

        double counter = 1;
        while (counter <= 12 && torn < 2) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >= 4.00) {
                sum += grade;
                counter++;
            } else {
                torn++;
            }
        }

        if (torn < 2) {
            double avg = sum / 12;
            System.out.println(name + " graduated. Average grade: " + String.format("%.2f", avg));
        } else {
            System.out.println(name + " has been excluded at " + String.format("%.0f", counter) + " grade");

        }
    }
}
