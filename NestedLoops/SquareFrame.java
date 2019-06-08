import java.util.Scanner;

public class SquareFrame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        //prints the top row
        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");

        //prints the middle row
        for (int i = 0; i < n - 2; i++) {
            System.out.print("|");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" -");
            }
            System.out.println(" |");
        }

        //prints the bottom row
        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");
    }
}
