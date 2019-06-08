import java.util.Scanner;

public class RectangleOf10X10Characters {
    private static String generateFrom(int numberOfStars, String symbol) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++) {
            builder.append(symbol);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String symbol = scan.nextLine();
        int numberOfStars = scan.nextInt();

        for (int i = 0; i < numberOfStars; i++) {
            System.out.println(generateFrom(numberOfStars, symbol));
        }
    }
}
