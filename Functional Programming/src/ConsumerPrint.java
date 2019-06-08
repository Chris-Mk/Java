import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Consumer<String> printer = System.out::println;

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");

        Arrays.stream(input).forEach(printer);
    }
}
