import java.util.Scanner;

public class DrawAFilledSquare {
    private static void printHeader(int n) {
        for (int i = 0; i < n * 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private static void printMiddle(int n) {
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("-");
            for (int j = 0; j < n - 1; j++) {
                System.out.print("\\/");
            }
            System.out.println("-");
        }
    }

    private static void printFooter(int n) {
        for (int i = 0; i < n * 2; i++) {
            System.out.print("-");
        }
    }

    private static void printSquare(int n) {
        printHeader(n);
        printMiddle(n);
        printFooter(n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.nextLine());
        printSquare(x);
    }
}
