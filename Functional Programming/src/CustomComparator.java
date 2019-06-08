import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CustomComparator {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (firstNum, secondNum) -> {
            if (firstNum % 2 == 0 && secondNum % 2 != 0) {
                return -1;
            } else if (firstNum % 2 != 0 && secondNum % 2 == 0) {
                return 1;
            }
            return firstNum - secondNum;
        };

        Scanner scan = new Scanner(System.in);
        Integer[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        Arrays.sort(numbers, comparator);
        System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\],]", ""));
    }
}
