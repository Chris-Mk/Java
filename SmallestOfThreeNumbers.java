import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        int minNumber = getSmallest(num1, num2);
        System.out.println(getSmallest(minNumber, num3));
    }

    static int getSmallest(int num1, int num2) {
        return  Math.min(num1, num2);
    }
}
