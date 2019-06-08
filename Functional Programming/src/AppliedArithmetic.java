import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Function<List<Integer>, List<Integer>> sum = numbers -> {
            List<Integer> temp = new ArrayList<>();
            numbers.forEach(e -> temp.add(e + 1));
            return temp;
        };

        Function<List<Integer>, List<Integer>> multiply = numbers -> {
            List<Integer> temp = new ArrayList<>();
            numbers.forEach(e -> temp.add(e * 2));
            return temp;
        };

        Function<List<Integer>, List<Integer>> subtract = numbers -> {
            List<Integer> temp = new ArrayList<>();
            numbers.forEach(e -> temp.add(e - 1));
            return temp;
        };

        Consumer<List<Integer>> printer = numbers -> System.out.println(
                numbers.toString().replaceAll("[\\[\\],]", ""));

        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commands;
        while (!"end".equals(commands = scan.nextLine())) {
            switch (commands) {
                case "add" -> numbers = sum.apply(numbers);
                case "multiply" -> numbers = multiply.apply(numbers);
                case "subtract" -> numbers = subtract.apply(numbers);
                case "print" -> printer.accept(numbers);
            }
        }
    }
}
