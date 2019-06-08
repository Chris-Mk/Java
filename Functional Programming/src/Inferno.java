import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inferno {
    public static void main(String[] args) {
        //BiPredicate<Integer, String> checkForLeft = ()

        Scanner scan = new Scanner(System.in);
        List<Integer> powers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> temp = new ArrayList<>(powers);

        String input;
        while (!"Forge".equals(input = scan.nextLine())) {
            String[] data = input.split(";");

            if ("Exclude".equals(data[0])) {
                switch (data[1]) {
                    case "Sum Left":
                        //temp = temp.stream().filter(e -> checkForLeft.test())
                        break;
                    case "Sum Right":
                        break;
                    case "Sum Left Right":
                        break;
                }
            } else {
                switch (data[1]) {
                    case "Sum Left":
                        break;
                    case "Sum Right":
                        break;
                    case "Sum Left Right":
                        break;
                }
            }
        }
    }
}
