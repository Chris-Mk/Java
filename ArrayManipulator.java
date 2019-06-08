import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] inputData = scan.nextLine().split("\\s+");

        int[] numbers = new int[inputData.length];

        for (int i = 0; i < inputData.length; i++) {
            numbers[i] = Integer.parseInt(inputData[i]);
        }

        String input;
        while (!"end".equals(input = scan.nextLine())) {
            String[] data = input.split("\\s");

            String command = data[0];
            switch (command) {
                case "exchange" -> exchangeArray(numbers, Integer.parseInt(data[1]));
                case "min" -> minElementIndex(numbers, data[1]);
                case "max" -> maxElementIndex(numbers, data[1]);
                case "first" -> firstCountElement(numbers, Integer.parseInt(data[1]), data[2]);
                case "last" -> lastCountElement(numbers, Integer.parseInt(data[1]), data[2]);
            }
        }

        System.out.println(Arrays.toString(numbers));
    }

    private static void lastCountElement(int[] numbers, int count, String command) {
        if (validateCount(numbers, count)) return;

        int num = command.equals("even") ? 0 : 1;
        int index = 0;
        fillElementByCriteria(numbers, count, num, index, "last");
    }

    private static void firstCountElement(int[] numbers, int count, String command) {
        if (validateCount(numbers, count)) return;
        int num = command.equals("even") ? 0 : 1;

        int index = 0;
        fillElementByCriteria(numbers, count, num, index, "first");
    }

    private static boolean validateCount(int[] numbers, int count) {
        if (count < 0 || count > numbers.length) {
            System.out.println("Invalid count");
            return true;
        }
        return false;
    }

    private static void fillElementByCriteria(int[] numbers, int count, int num, int index, String criteria) {
        int[] result = new int[0];

        for (int number : numbers) {
            if (number % 2 == num) {
                if (index == result.length) {
                    result = changeArraySize(result);
                }
                result[index++] = number;
            }
        }


        if (index == 0) {
            System.out.println("[]");
        } else {
            int minCount = Math.min(count, result.length);
            StringBuilder output = new StringBuilder("[");

            if (criteria.equals("first")) {
                for (int i = 0; i < minCount; i++) {
                    if (i < minCount - 1) {
                        output.append(result[i]).append(", ");
                    } else {
                        output.append(result[i]).append("]");
                    }
                }
            } else {
                int countElement = 0;
                for (int i = 0; i < minCount; i++) {
                    if (i < minCount - 1) {
                        output.append(result[result.length - minCount + countElement++]).append(", ");
                    } else {
                        output.append(result[result.length - minCount + countElement++]).append("]");
                    }
                }
            }

            System.out.println(output);
        }
    }

    private static int[] changeArraySize(int[] result) {
        int[] newArray = new int[result.length + 1];

        System.arraycopy(result, 0, newArray, 0, result.length);

        return newArray;
    }

    private static void minElementIndex(int[] numbers, String command) {
        int num = command.equals("even") ? 0 : 1;

        int minElement = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == num) {
                if (numbers[i] <= minElement) {
                    minElement = numbers[i];
                    index = i;
                }
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void maxElementIndex(int[] numbers, String command) {
       int num = command.equals("even") ? 0 : 1;

       int maxElement = Integer.MIN_VALUE;
       int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == num) {
                if (numbers[i] >= maxElement) {
                    maxElement = numbers[i];
                    index = i;
                }
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void exchangeArray(int[] numbers, int index) {
        if (index < 0 || index >= numbers.length) {
            System.out.println("Invalid index");
            return;
        }

        int count = 0;
        int[] result = new int[numbers.length];

        for (int i = index + 1; i < numbers.length; i++) {
            result[count++] = numbers[i];
        }

        for (int i = 0; i <= index; i++) {
            result[count++] = numbers[i];
        }

        System.arraycopy(result, 0, numbers, 0, numbers.length);
    }
}
