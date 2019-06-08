import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        int addition = sum(num1, num2);
        System.out.println(difference(addition , num3));
    }

    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    static int difference(int addition, int num3) {
        return addition - num3;
    }
}
