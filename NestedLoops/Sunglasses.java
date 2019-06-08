import java.util.Scanner;

public class Sunglasses {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //print the upper part
        for (int columns = 1; columns <= 5 * n; columns++) {
            if (columns > ((5 * n) - n) / 2 && columns <= (((5 * n) - n) / 2) + n) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();

        //print the middle part
        for (int rows = 1; rows <= n - 2; rows++) {
            System.out.print("*");
            for (int columns = 1; columns < 5 * n; columns++) {
                if (columns <= (((5 * n) - n) / 2) - 2) {
                    System.out.print("/");
                } else if (columns >= (((5 * n) - n) / 2) + n + 1 && columns < 5 * n - 1) {
                    System.out.print("/");
                } else {
                    if (columns == ((5 * n) - n) / 2 - 1 || columns == (((5 * n) - n) / 2) + n || columns >= 5 * n - 1) {
                        System.out.print("*");
                    } else if (rows == ((n - 1) / 2) - 1) {
                        System.out.print(" ");
                    } else {
                        if (rows == ((n - 1) / 2) - 1) {
                            System.out.print("|");
                        }
                    }
                }
            }
            System.out.println();
        }

        //print the bottom part
        for (int columns = 1; columns <= 5 * n; columns++) {
            if (columns > ((5 * n) - n) / 2 && columns <= (((5 * n) - n) / 2) + n) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
    }
}
