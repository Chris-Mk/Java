import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        String result;
        if (middleCharacter(text)) {
            result = String.valueOf(text.charAt(text.length() / 2));
        } else {
            result = String.valueOf(text.charAt(text.length() / 2 - 1)) +
                    text.charAt(text.length() / 2);
        }

        System.out.println(result);
    }

    static boolean middleCharacter(String text) {
        if (text.length() % 2 != 0) {
            return true;
        }
        return false;
    }
}
