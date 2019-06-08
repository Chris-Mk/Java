import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number in the range [1...100]: ");
        int num = scan.nextInt();

        while (num < 1 || num > 100) {
            System.out.println("Invalid number!");
            System.out.println("Enter a number in the range [1...100]: ");
            num = scan.nextInt();
        }
        System.out.println("The number is: " + num);
    }
}
