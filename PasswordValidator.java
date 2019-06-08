import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        if (!isInRange(password)) {
            System.out.println("Password must be between 6 and 10 characters" );
        }

        if (!isLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!hasAtLeastTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }


        if (isLettersAndDigits(password) && isInRange(password) && hasAtLeastTwoDigits(password)) {
            System.out.println("Password is valid");
        }
    }

    static boolean isInRange(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    static boolean isLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean hasAtLeastTwoDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }

        return count >= 2;
    }
}
