import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        int counter = 1;
        String name = scan.nextLine();;
        while (!(name.equals(password))) {

            if (counter++ == 4) {
                System.out.printf("User %s blocked!\n", username);
                return;
            }

            System.out.println("Incorrect password. Try again.");
            name = scan.nextLine();
        }

        System.out.printf("User %s logged in.\n", username);
    }
}
