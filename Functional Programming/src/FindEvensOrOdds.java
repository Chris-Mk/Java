import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) {

        Predicate<Integer> getEven = num -> num % 2 == 0;
        Predicate<Integer> getOdd = num -> num % 2 != 0;
        Consumer<Integer> print = num -> System.out.print(num + " ");

        Scanner scan = new Scanner(System.in);
        int lowerBound = scan.nextInt();
        int upperBound = scan.nextInt();
        scan.nextLine();
        String type = scan.nextLine();

        IntStream.rangeClosed(lowerBound, upperBound)
                .filter(num -> {
                    if (type.equals("odd")) {
                        return getOdd.test(num);
                    }
                    return getEven.test(num);
                })
                .forEach(print::accept);
    }
}
