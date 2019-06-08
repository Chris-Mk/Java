import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int counter = 0;
        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                counter++;
                if (counter <= n) {
                    System.out.print(counter + " ");
                }
            }
            if (counter > n) {
                break;
            }
            System.out.println();
        }
    }
}
