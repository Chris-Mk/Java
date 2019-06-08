import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class PredicateForNames {
    public static void main(String[] args) {
        BiPredicate<String, Integer> isOfRequiredLength = (name, length) -> name.length() <= length;
        Consumer<String> printer = System.out::println;

        Scanner scan = new Scanner(System.in);
        int requiredLength = Integer.parseInt(scan.nextLine());
        String[] names = scan.nextLine().split("\\s+");

        Arrays.stream(names)
                .filter(name -> isOfRequiredLength.test(name, requiredLength))
                .forEach(printer);
    }
}
