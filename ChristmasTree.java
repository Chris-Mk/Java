import java.util.Scanner;

public class ChristmasTree {
    private static String generateFrom(String symbol, int numberOfStars) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++) {
            builder.append(symbol);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfStars = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= numberOfStars; i++) {
            String stars = generateFrom("*", i);
            String space = generateFrom(" ", numberOfStars - i);
            System.out.print(space);
            System.out.print(stars);
            System.out.print(" | ");
            System.out.print(stars);
            System.out.println(space);
        }
    }
}
