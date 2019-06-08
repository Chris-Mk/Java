import java.util.Scanner;

public class EqualSumsEvenOddPosition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        for (int i = num1; i <= num2; i++) {
            String str1 = Integer.toString(i);
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 1; j <= str1.length(); j++) {
                int n1 = Character.getNumericValue(str1.charAt(j - 1));
                if (j % 2 == 0) {
                    evenSum += n1;
                } else {
                    oddSum += n1;
                }
            }

            if (evenSum == oddSum) {
                System.out.print(str1 + " ");
            }
        }
    }
}

