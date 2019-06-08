import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

public class ListOfPredicates {
    public static void main(String[] args) {
        BiFunction<int[], Integer, List<Integer>> isDivisible = (numbers, n) -> {
            List<Integer> validNumbers = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                boolean divisible = true;

                for (int number : numbers) {
                    if (i % number != 0) divisible = false;
                }
                if (divisible) validNumbers.add(i);
            }
            return validNumbers;
        };

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(isDivisible.apply(numbers, n).toString().replaceAll("[\\[\\],]", ""));
    }
}
