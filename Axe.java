import java.util.Scanner;

public class Axe {
    private static String repeatStr(String symbol, int count) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append(symbol);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int leftHyphens = 5 * n - n * 2;
        int rightHyphens = n * 2 - 2;

        //prints the first single row
        System.out.println(String.format("%s**%s",
                repeatStr("-", leftHyphens),
                repeatStr("-", rightHyphens)));

        //prints the rest of the top part
        for (int i = 1; i <= n - 1; i++) {
            rightHyphens--;
            System.out.println(String.format("%s*%s*%s",
                    repeatStr("-", leftHyphens),
                    repeatStr("-", i),
                    repeatStr("-", rightHyphens)));
        }

        //prints the middle row
        int middleHyphens = n - 1;
        for (int i = 0; i < n / 2; i++) {
            System.out.println(String.format("%s*%s*%s",
                    repeatStr("*", leftHyphens),
                    repeatStr("-", middleHyphens),
                    repeatStr("-", middleHyphens)));
        }

        //prints the bottom part but not the last row
        int bottomRightHyphens = middleHyphens;
        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.println(String.format("%s*%s*%s",
                    repeatStr("-", leftHyphens),
                    repeatStr("-", middleHyphens),
                    repeatStr("-", bottomRightHyphens)));
            leftHyphens--;
            middleHyphens += 2;
            bottomRightHyphens--;
        }

        //prints the last row
        System.out.printf("%s*%s*%s",
                repeatStr("-", leftHyphens),
                repeatStr("*", middleHyphens),
                repeatStr("-", bottomRightHyphens));
    }
}
