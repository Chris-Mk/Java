import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int f0 = 1, f1 = 1;
        System.out.print(f0 + " " + f1);

        int cnt = 2;
        while (cnt <= n) {
            int fn = f1 + f0;
            f0 = f1;
            f1 = fn;
            System.out.print(" " + fn);
            cnt++;
        }
    }
}
