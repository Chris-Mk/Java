import java.util.Scanner;

public class NotDivisibleBy7Pt2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            if (i % 7 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
