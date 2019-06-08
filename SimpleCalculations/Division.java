import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int num = 0;
        boolean isDivisible = false;

        if (number % 10 == 0) {
            num = 10;
            isDivisible = true;
        } else if (number % 7 == 0) {
            num = 7;
            isDivisible = true;
        } else if (number % 6 == 0) {
            num = 6;
            isDivisible = true;
        } else if (number % 3 == 0) {
            num = 3;
            isDivisible = true;
        } else if (number % 2 == 0) {
            num = 2;
            isDivisible = true;
        }

        if (isDivisible) {
            System.out.println("The number is divisible by " + num);
        } else {
            System.out.println("Not divisible");
        }
    }
}
