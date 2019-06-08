import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double p1;
        double p2;
        double p3;

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num % 2 == 0) {
                counter1++;
            }

            if (num % 3 == 0) {
                counter2++;
            }

            if (num % 4 == 0) {
                counter3++;
            }
        }

        p1 = counter1 * 100.0 / n;
        p2 = counter2 * 100.0 / n;
        p3 = counter3 * 100.0 / n;
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
    }
}
