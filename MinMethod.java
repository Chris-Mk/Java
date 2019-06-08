import java.util.Scanner;

public class MinMethod {
    private static int getMin(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int min = getMin(getMin(num1, num2), num3);
        System.out.println(min);
    }
}
