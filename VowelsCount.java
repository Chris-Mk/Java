import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (isVowel(text.charAt(i))) {
                count++;
            }
        }

        System.out.println(count);
    }

    static boolean isVowel(char symbol) {
        return "aeiou".indexOf(symbol) != -1;
    }
}
