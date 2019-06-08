import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();

        long sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));

            int factorial = 1;
            for (int j = 1; j <= digit; j++) {
                factorial *= j;
            }

            sum += factorial;
        }

        System.out.println(number.equals(String.valueOf(sum)) ? "yes" : "no");
    }
}
