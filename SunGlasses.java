import java.util.Scanner;

public class SunGlasses {
    private static String generateFrom(String symbol, int numberOfStars) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++) {
            builder.append(symbol);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //print the top part
        System.out.print(generateFrom("*", 2 * n));
        System.out.print(generateFrom(" ", n));
        System.out.println(generateFrom("*", 2 * n));

        //print the middle part
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            System.out.print(generateFrom("/", 2 * n - 2));
            System.out.print("*");

            if (i == ((n - 1) / 2) - 1) {
                System.out.print(generateFrom("|", n));
            } else {
                System.out.print(generateFrom(" ", n));
            }

            System.out.print("*");
            System.out.print(generateFrom("/", 2 * n - 2));
            System.out.print("*");
            System.out.println();
        }

        //print the bottom part
        System.out.print(generateFrom("*", 2 * n));
        System.out.print(generateFrom(" ", n));
        System.out.println(generateFrom("*", 2 * n));
    }
}
