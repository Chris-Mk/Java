import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();

        while (!"END".equals(command)) {
            System.out.println(isPalindrome(command));

            command = scan.nextLine();
        }
    }

    static boolean isPalindrome(String number) {
        StringBuilder palindrome = new StringBuilder();

        for (int i = number.length() - 1; i >= 0; i--) {
            palindrome.append(number.charAt(i));
        }

        if (number.equals(palindrome.toString())) {
            return true;
        }

        return false;
    }
}
