import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        BiPredicate<String, String> startsWith = String::startsWith;
        BiPredicate<String, String> endsWith = String::endsWith;
        BiPredicate<String, String> checkLength = (value, length) -> value.length() == Integer.parseInt(length);

        Scanner scan = new Scanner(System.in);
        List<String> people = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String input;

        while (!"Party!".equals(input = scan.nextLine())) {
            String[] data = input.split("\\s+");

            if ("Double".equals(data[0])) {
                switch (data[1]) {
                    case "StartsWith":
                        List<String> doubleStarts = people.stream()
                                .filter(person -> startsWith.test(person, data[2]))
                                .collect(Collectors.toList());
                        people.addAll(doubleStarts);
                        break;
                    case "EndsWith":
                        List<String> doubleEnds = people.stream()
                                .filter(person -> endsWith.test(person, data[2]))
                                .collect(Collectors.toList());
                        people.addAll(doubleEnds);
                        break;
                    case "Length":
                        List<String> doubleLength = people.stream()
                                .filter(person -> checkLength.test(person, data[2]))
                                .collect(Collectors.toList());
                        people.addAll(doubleLength);
                        break;
                }
            } else if ("Remove".equals(data[0])) {
                switch (data[1]) {
                    case "StartsWith":
                        List<String> removeStarts = people.stream()
                                .filter(person -> startsWith.test(person, data[2]))
                                .collect(Collectors.toList());
                        people.removeAll(removeStarts);
                        break;
                    case "EndsWith":
                        List<String> removeEnds = people.stream()
                                .filter(person -> endsWith.test(person, data[2]))
                                .collect(Collectors.toList());
                        people.removeAll(removeEnds);
                        break;
                    case "Length":
                        List<String> removeLength = people.stream()
                                .filter(person -> checkLength.test(person, data[2]))
                                .collect(Collectors.toList());
                        people.removeAll(removeLength);
                        break;
                }
            }
        }
        people = people.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        if (people.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(String.join(", ", people) + " are going to the party!");
        }
    }
}
