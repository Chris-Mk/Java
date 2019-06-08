import java.util.Scanner;

public class NthDigit {
    private static void findNthDigit(int number, int index) {
        String numString = String.valueOf(number);
        StringBuilder reversedString = new StringBuilder(numString);
        reversedString.reverse();
        System.out.println(reversedString.charAt(index - 1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int count = Integer.parseInt(scan.nextLine());
        findNthDigit(num, count);
    }
}
