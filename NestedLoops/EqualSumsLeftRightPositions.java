import java.util.Scanner;

public class EqualSumsLeftRightPositions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int leftSum;
        int rightSum;

        for (int i = num1; i <= num2; i++) {
            int leftDigits = i / 1000;
            int rightDigits = i % 100;

            int r1 = rightDigits % 10;
            int r2 = rightDigits / 10;
            rightSum = r1 + r2;

            int l1 = leftDigits % 10;
            int l2 = leftDigits / 10;
            leftSum = l1 + l2;

            String sNum1 = String.valueOf(i);
            int middleDigit = Character.getNumericValue(sNum1.charAt(2));

            if (rightSum != leftSum) {
                if (rightSum < leftSum) {
                    rightSum += middleDigit;
                } else {
                    leftSum += middleDigit;
                }
            }

            if (rightSum == leftSum) {
                System.out.print(i + " ");
            }
        }
    }
}
