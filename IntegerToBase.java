import java.util.Scanner;

public class IntegerToBase {
    private static String integerToBase(int number, int toBase) {
        StringBuilder result = new StringBuilder();
        while (number != 0) {
            int remainder = number % toBase;
            result.append(remainder);
            number /= toBase;
        }
        result.reverse();
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int base = Integer.parseInt(scan.nextLine());
        String newNumber = integerToBase(num, base);
        System.out.println(newNumber);
    }
}
