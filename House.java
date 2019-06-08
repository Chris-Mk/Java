import java.util.Scanner;

public class House {
    private static String generateFrom(String symbol, int numberOfStars) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++) {
            builder.append(symbol);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lengthOfHouse = Integer.parseInt(scan.nextLine());

        int stars = 1;
        if (lengthOfHouse % 2 == 0) {
            stars++;
        }

        //print the roof  of the house
        int roofLength = (int) Math.ceil(lengthOfHouse / 2.0);
        for (int i = 0; i < roofLength; i++) {
            int padding = (lengthOfHouse - stars) / 2;
            String line = generateFrom("-", padding) + generateFrom("*", stars) + generateFrom("-", padding);
            System.out.println(line);
            stars += 2;
        }

        //print the base of the house
        for (int i = 0; i < lengthOfHouse / 2; i++) {
            System.out.println("|" + generateFrom("*", lengthOfHouse - 2) + "|");
        }
    }
}
