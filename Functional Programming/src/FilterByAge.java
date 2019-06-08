import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FilterByAge {
    public static void main(String[] args) {
        BiPredicate<Map.Entry<String, Integer>, Integer> youngerThan = (person, ageLimit) ->
                person.getValue() <= ageLimit;

        BiPredicate<Map.Entry<String, Integer>, Integer> olderThan = (person, ageLimit) ->
                person.getValue() >= ageLimit;

        Consumer<Map.Entry<String, Integer>> printName = person ->
                System.out.println(person.getKey());

        Consumer<Map.Entry<String, Integer>> printAge = person ->
                System.out.println(person.getValue());

        Consumer<Map.Entry<String, Integer>> printNameAndAge = person ->
                System.out.println(String.format("%s - %d", person.getKey(), person.getValue()));

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] personData = scan.nextLine().split(",\\s+");
            String name = personData[0];
            String age = personData[1];
            people.put(name, Integer.valueOf(age));
        }

        String condition = scan.nextLine();
        int ageLimit = Integer.parseInt(scan.nextLine());
        String format = scan.nextLine();

        people.entrySet()
                .stream()
                .filter(person -> {
                    if (condition.equals("younger")) {
                        return youngerThan.test(person, ageLimit);
                    }
                    return olderThan.test(person, ageLimit);
                })
                .forEach(p -> {
                    if (format.equals("name")) {
                        printName.accept(p);
                    } else if (format.equals("age")) {
                        printAge.accept(p);
                    } else {
                        printNameAndAge.accept(p);
                    }
                });
    }
}
