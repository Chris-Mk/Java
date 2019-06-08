import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the numbers: ");
        int min = Integer.MAX_VALUE;

        while (n > 0) {
            int num = Integer.parseInt(scan.nextLine());

            if (num < min) {
                min = num;
            }
            n--;
        }
        System.out.println("min = " + min);
    }
}
