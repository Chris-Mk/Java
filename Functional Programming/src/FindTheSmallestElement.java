import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Function<List<Integer>, Integer> getMinElement = numbers -> {
            int minIndex = 0;

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(minIndex) >= numbers.get(i)) {
                    minIndex = i;
                }
            }
            return minIndex;
        };

        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(e -> !e.equals(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(getMinElement.apply(numbers));
    }
}
