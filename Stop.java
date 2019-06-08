import java.util.Scanner;

public class Stop {
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

        int dots = n + 1;
        int underscores = 2 * n + 1;
        //print the top single line
        System.out.println(String.format("%s%s%s",
                repeatStr(".", dots),
                repeatStr("_", underscores),
                repeatStr(".", dots)));

        //print the rest of the top part
        underscores -= 2;
        dots--;
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("%s//%s\\\\%s",
                    repeatStr(".", dots),
                    repeatStr("_", underscores),
                    repeatStr(".", dots)));
            underscores += 2;
            dots--;
        }

        //print the central line with the stop sign
        int newUnderscores = (underscores - 5) / 2;
        System.out.println(String.format("//%sSTOP!%s\\\\",
                repeatStr("_", newUnderscores),
                repeatStr("_", newUnderscores)));

        //print the bottom part
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("%s\\\\%s//%s",
                    repeatStr(".", i),
                    repeatStr("_", underscores),
                    repeatStr(".", i)));
            underscores -= 2;
        }
    }
}
