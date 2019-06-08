import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num < 200) {
                counter1 ++;

            } else if (num >= 200 && num <= 399) {
                counter2 ++;

            } else if (num >= 400 && num <= 599) {
                counter3 ++;

            } else if (num >= 600 && num <= 799) {
                counter4 ++;

            } else if (num >= 800) {
                counter5 ++;

            }
        }
        double p1 = counter1 * 100.0 / n;
        System.out.printf("%.2f%%\n", p1);

        double p2 = counter2 * 100.0 / n;
        System.out.printf("%.2f%%\n", p2);

        double p3 = counter3 * 100.0 / n;
        System.out.printf("%.2f%%\n", p3);

        double p4 = counter4 * 100.0 / n;
        System.out.printf("%.2f%%\n", p4);

        double p5 = counter5 * 100.0 / n;
        System.out.printf("%.2f%%\n", p5);

    }
}
