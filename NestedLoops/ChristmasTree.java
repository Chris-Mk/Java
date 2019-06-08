import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //prints the top stem
        for (int rows = 1; rows <= n; rows++) {
            System.out.print(" ");
        }
        System.out.println(" |");

        // prints the rest of the tree
        for (int rows = 1; rows <= n; rows++) {
            //prints the spaces
            for (int columns = 1; columns <= n - rows; columns++) {
                System.out.print(" ");
            }

            //prints the stars before the stem and prints the stem itself
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("*");
            }
            System.out.print(" | ");

            //prints the stars after the stem
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
