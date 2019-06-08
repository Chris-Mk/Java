import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Consumer<String> printer = name -> System.out.println("Sir " + name);

        Scanner scan = new Scanner(System.in);
        String[] names = scan.nextLine().split("\\s+");
        Arrays.stream(names).forEach(printer);
    }
}
