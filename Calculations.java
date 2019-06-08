import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String action = scan.nextLine();
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        switch (action) {
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber, secondNumber);
                break;
            default:
                divide(firstNumber, secondNumber);
                break;
        }
    }

    private static void divide(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }

    private static void multiply(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    private static void subtract(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    private static void add(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }

}
