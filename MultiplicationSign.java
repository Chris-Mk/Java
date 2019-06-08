import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        if (isPositive(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("positive");
        } else if (isNegative(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    static boolean isPositive(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > 0 && secondNumber > 0 && thirdNumber > 0) {
            return true;
        }

        return false;
    }

    static boolean isNegative(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < 0 || secondNumber < 0 || thirdNumber < 0) {
            return true;
        }

        return false;
    }

    static boolean isZero(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == 0 || secondNumber == 0 || thirdNumber == 0) {
            return true;
        }

        return false;
    }
}
