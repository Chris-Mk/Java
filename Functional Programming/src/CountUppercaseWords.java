import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split("\\s+");

        Predicate<String> isUppercase = word -> Character.isUpperCase(word.charAt(0));
        List<String> uppercaseWord = new ArrayList<>();

        for (String word : text) {
            if (isUppercase.test(word)) {
                uppercaseWord.add(word);
            }
        }
        System.out.println(uppercaseWord.size());
        uppercaseWord.forEach(System.out::println);
    }
}
