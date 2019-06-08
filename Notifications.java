import java.util.Scanner;

public class Notifications {
    private static void showSuccessMessage(String operation, String message) {
        System.out.println(operation + " " + message);
        System.out.println("===========================================");
        System.out.println(message);
        System.out.println();
    }

    private static void showWarningMessage(String message) {
        System.out.println(message);
        System.out.println("===============================================");
        System.out.println();
    }

    private static void showErrorMessage(String operation, String message, int errorCode) {
        System.out.println(operation + ": Failed to execute " + message + ".");
        System.out.println("================================================");
        System.out.println("Reason: " + message + ".");
        System.out.println("Error code: " + errorCode + ".");
        System.out.println();
    }

    private static void readAndProcessMessage(Scanner scan) {
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String opera = scan.nextLine();

            if (opera.equals("success")) {
                String message = scan.nextLine();
                showSuccessMessage(opera, message);
            } else if (opera.equals("warning")) {
                String warn = scan.nextLine();
                showWarningMessage(warn);
            } else {
                String err = scan.nextLine();
                int errCode = Integer.parseInt(scan.nextLine());
                showErrorMessage(opera, err, errCode);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        readAndProcessMessage(scan);
    }
}
