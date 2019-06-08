import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        System.out.printf("%.2f", getQuotient(firstNumber, secondNumber));
    }

    static double getFirstFactorial(int firstNumber) {
        double factorial = 1;
        for (int i = 1; i <= firstNumber; i++) {
            factorial *= i;
        }

        return factorial;
    }

    static double getSecondFactorial(int secondNumber) {
        double factorial = 1;
        for (int i = 1; i <= secondNumber; i++) {
            factorial *= i;
        }

        return factorial;
    }

    static double getQuotient(int firstNumber, int secondNumber) {
        return getFirstFactorial(firstNumber) / getSecondFactorial(secondNumber);
    }
}
