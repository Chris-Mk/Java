import java.util.Scanner;

public class StringEncryption {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char letter = scan.nextLine().charAt(0);
            builder.append(encrypt(letter));
        }
        System.out.println(builder);
    }

    private static StringBuilder encrypt(char letter) {
        StringBuilder builder = new StringBuilder();
        String asciiString = String.valueOf((int) letter);

        builder.append(asciiString.charAt(0));
        builder.append(asciiString.charAt(asciiString.length() - 1));

        char begin = (char) ((int) letter + Character.getNumericValue(asciiString.charAt(asciiString.length() - 1)));
        builder.insert(0, begin);

        char end = (char) ((int) letter - Character.getNumericValue(asciiString.charAt(0)));
        builder.append(end);

        return builder;
    }
}
