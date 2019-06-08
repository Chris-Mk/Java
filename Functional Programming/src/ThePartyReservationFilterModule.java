import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) {
        BiPredicate<String, String> addStartsWith = (person, criteria) -> !person.startsWith(criteria);
        BiPredicate<String, String> addEndsWith = (person, criteria) -> !person.endsWith(criteria);
        BiPredicate<String, String> addLength = (person, length) -> person.length() != Integer.parseInt(length);
        BiPredicate<String, String> addExistence = (person, criteria) -> !person.contains(criteria);

        BiFunction<List<String>, String, List<String>> removeStartsWith = (list, criteria) -> list.stream()
                .filter(p -> p.startsWith(criteria)).collect(Collectors.toList());
        BiFunction<List<String>, String, List<String>> removeEndsWith = (list, criteria) -> list.stream()
                .filter(p -> p.endsWith(criteria)).collect(Collectors.toList());
        BiFunction<List<String>, String, List<String>> removeLength = (list, length) -> list.stream()
                .filter(p -> p.length() == Integer.parseInt(length)).collect(Collectors.toList());
        BiFunction<String, String, Boolean> removeExistence = String::contains;

        Scanner scan = new Scanner(System.in);
        List<String> invitations = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input;
        List<String> temp = new ArrayList<>(invitations);
        while (!"Print".equals(input = scan.nextLine())) {
            String[] data = input.split(";");

            if ("Add filter".equals(data[0])) {
                switch (data[1]) {
                    case "Starts with" -> temp = temp.stream().filter(p -> addStartsWith.test(p, data[2]))
                            .collect(Collectors.toList());
                    case "Ends with" -> temp = temp.stream().filter(p -> addEndsWith.test(p, data[2]))
                            .collect(Collectors.toList());
                    case "Length" -> temp = temp.stream().filter(p -> addLength.test(p, data[2]))
                            .collect(Collectors.toList());
                    case "Contains" -> temp = temp.stream().filter(p -> addExistence.test(p, data[2]))
                            .collect(Collectors.toList());
                }
            } else {
                switch (data[1]) {
                    case "Starts with" -> temp.addAll(removeStartsWith.apply(invitations, data[2]));
                    case "Ends with" -> temp.addAll(removeEndsWith.apply(invitations, data[2]));
                    case "Length" -> temp.addAll(removeLength.apply(invitations, data[2]));
                    case "Contains" -> temp.addAll(invitations.stream().filter(e -> removeExistence.apply(e, data[2]))
                            .collect(Collectors.toList()));
                }
            }
        }
        invitations.retainAll(temp);
        System.out.println(invitations.toString().replaceAll("[\\[\\],]", ""));
    }
}
