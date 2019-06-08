import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int secondNumber = Integer.parseInt(scan.nextLine());

        System.out.printf("%.0f", calculate(firstNumber, operator, secondNumber));
    }

    static double calculate(int firstNumber, String operator, int secondNumber) {
        double result = 0d;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = (double) firstNumber / secondNumber;
        }

        return result;
    }
}
