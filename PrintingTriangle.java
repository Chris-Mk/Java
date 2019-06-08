import java.util.Scanner;

public class PrintingTriangle {

    private static void printTriangle(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //prints the top part
        for (int i = 0; i < n; i++) {
            printTriangle(1, i);
        }

        //prints the middle row
        printTriangle(1, n);

        //prints the bottom part
        for (int i = n -1; i > 0; i--) {
            printTriangle(1, i);
        }
    }
}
