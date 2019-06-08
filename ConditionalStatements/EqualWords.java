import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {

        Scanner print = new Scanner(System.in);
        String word1 = print.nextLine();
        String word2 = print.nextLine();

        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
