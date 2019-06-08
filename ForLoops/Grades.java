package ForLoops;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int students = Integer.parseInt(scan.nextLine());
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;
        double sumScore = 0.0d;

        for (int i = 0; i < students; i++) {
            double score = Double.parseDouble(scan.nextLine());
            sumScore += score;

            if (score >= 5.00) {
                cnt1++;
            } else if (score >= 4.00 && score <= 4.99) {
                cnt2++;
            } else if (score >= 3.00 && score <= 3.99) {
                cnt3++;
            } else {
                cnt4++;
            }
        }
        double topStudentsAvg = cnt1 * 100.0 / students;
        double btn4Avg = cnt2 * 100.0 / students;
        double btn3Avg = cnt3 * 100.0 / students;
        double failAvg = cnt4 * 100.0 / students;
        double avgSuccessOfExam = sumScore / students;

        System.out.printf("Top students: %.2f%%%n", topStudentsAvg);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", btn4Avg);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", btn3Avg);
        System.out.printf("Fail: %.2f%%%n", failAvg);
        System.out.printf("Average: %.2f", avgSuccessOfExam);
    }
}
