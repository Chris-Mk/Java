import java.util.Scanner;

public class SignOfIntegerNumber {
    static void getIntegerSign(int n) {
        if (n > 0) {
            System.out.printf("The number %d is positive.", n);
        } else if (n < 0) {
            System.out.printf("The number %d is negative.", n);
        } else {
            System.out.println("The number is zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        getIntegerSign(n);
    }
}
