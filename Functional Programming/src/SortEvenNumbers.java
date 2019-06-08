import java.util.*;

public class SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] number = Arrays.stream(scan.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(number).replaceAll("[\\[\\]]", ""));

        number = Arrays.stream(number)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(number).replaceAll("[\\[\\]]", ""));
    }
}
