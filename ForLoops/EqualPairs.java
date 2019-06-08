import java.util.Scanner;

public class EqualPairs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int lastPair = 0;
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scan.nextLine());
            int num2 = Integer.parseInt(scan.nextLine());

            int currentPair = num1 + num2;
            if (i >= 1) {
                int diff = Math.abs(currentPair - lastPair);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
            lastPair = currentPair;
        }
        if (maxDiff == 0) {
            System.out.printf("Yes, value = %d", lastPair);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
