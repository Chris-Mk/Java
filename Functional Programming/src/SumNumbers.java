import java.util.Scanner;
import java.util.function.BiFunction;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] strNums = scan.nextLine().split(",\\s+");

       System.out.println("Count = " + strNums.length);
//        Function<String, Integer> parser = Integer::parseInt;
//        System.out.println(String.format("Sum = %d", Arrays.stream(strNums).map(parser).reduce(Integer::sum).get()));

        BiFunction<String, String, Integer> getSum = (x, y) -> Integer.parseInt(x) + Integer.parseInt(y);

        int sum = 0;
        for (int i = 0; i < strNums.length; i += 2) {
            sum += getSum.apply(strNums[i], strNums[i + 1]);
        }
        System.out.println("Sum = " + sum);
    }
}
