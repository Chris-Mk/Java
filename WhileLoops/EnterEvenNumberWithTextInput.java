import java.util.Scanner;

public class EnterEvenNumberWithTextInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        while (true) {
            try {
                System.out.print("Enter even number: ");
                n = Integer.parseInt(scan.nextLine());
                if (n % 2 == 0) {
                    System.out.printf("Even number entered: %d.", n);
                    break;
                }
                System.out.println("The number is not even.");
            } catch (Exception ex) {
                System.out.println("Invalid number.");
            }
        }
    }
}
