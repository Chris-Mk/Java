import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int f0 = 1;
        int f1 = 1;

        int cnt = 0;
        while (cnt < n - 1) {
            int fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            cnt++;
        }
        System.out.println(f1);
    }
}
