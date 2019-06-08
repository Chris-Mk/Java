import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        System.out.println(a);
    }
}
