import java.util.Scanner;

public class NotDivisibleBy7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (!(i % 7 == 0) && !(i % 2 == 0)) {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
