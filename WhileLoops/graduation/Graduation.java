package graduation;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double sum = 0;

        int counter = 1;
        while (counter <= 12) {
            double marks = scan.nextDouble();
            if (marks >= 4.00) {
                sum += marks;
                counter++;
            }
        }
        double avg = sum / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, avg);
    }
}
