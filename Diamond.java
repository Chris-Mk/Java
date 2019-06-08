import java.util.Scanner;

public class Diamond {

    private static String generateFrom(int numberOfStars) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++) {
            builder.append("-");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int left = (int) Math.floor((n - 1) / 2f);
        int right = left - 1;

        //print the top part and the middle part
        for (int i = 0; i < Math.floor(n / 2f + 1); i++) {
            System.out.print(generateFrom(left));
            System.out.print("*");

            int mid = n - 2 * left - 2;
            if (mid >= 0) {
                System.out.print(generateFrom(mid));
                System.out.print("*");
            }

            System.out.println(generateFrom(left));
            left--;
        }

        //print the bottom part

        for (int i = 0; i < (n - 1) / 2; i++) {
            right++;
            System.out.print(generateFrom(right));
            System.out.print("*");

            int mid = n - 2 * right - 2;
            if (mid >= 0) {
                System.out.print(generateFrom(mid));
                System.out.print("*");
            }
            System.out.println(generateFrom(right));
        }
    }
}
