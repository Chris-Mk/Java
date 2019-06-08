import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Function<int[], int[]> reverseArray = numbers -> {
            for(int i = 0; i < numbers.length / 2; i++) {
                int temp = numbers[i];
                numbers[i] = numbers[numbers.length - i - 1];
                numbers[numbers.length - i - 1] = temp;
            }
            return numbers;
        };

        BiFunction<int[], Integer, int[]> filterElements = (numbers, n) -> {
            numbers = Arrays.stream(numbers).filter(e -> e % n != 0).toArray();
            return numbers;
        };

        Consumer<int[]> printer = numbers ->
                System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\],]", ""));

        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = Integer.parseInt(scan.nextLine());
        printer.accept(filterElements.apply(reverseArray.apply(numbers), n));
    }
}
