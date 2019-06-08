import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Function<int[], Integer> getMinNumber = numbers -> {
          int min = Integer.MAX_VALUE;

            for (int number : numbers) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        };

        Consumer<Integer> printer = System.out::println;

        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        printer.accept(getMinNumber.apply(numbers));
    }
}
