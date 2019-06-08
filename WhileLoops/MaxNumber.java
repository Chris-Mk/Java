import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the numbers: ");
        int max = Integer.MIN_VALUE;

        while (n > 0) {
            int num = Integer.parseInt(scan.nextLine());

            if (num > max) {
                max = num;
            }
            n--;
        }
        System.out.println("max = " + max);
    }
}
