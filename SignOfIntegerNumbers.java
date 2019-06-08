import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        getSign(number);
    }

    static void getSign(int number) {
        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else if (number > 0){
            System.out.printf("The number %d is positive.", number);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
