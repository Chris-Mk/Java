import java.util.Scanner;

public class Butterfly {
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

        int rows = 2 * (n - 2) + 1;
        int leftRight = n - 1;

        //print the upper wings
        for (int i = 0; i < rows / 2; i++) {
            if (i % 2 == 0) {
                System.out.println(String.format("%s\\ /%s",
                        repeatStr("*", leftRight - 1),
                        repeatStr("*", leftRight - 1)));

            } else {
                System.out.println(String.format("%s\\ /%s",
                        repeatStr("-", leftRight - 1),
                        repeatStr("-", leftRight - 1)));

            }
        }

        //print the body
        System.out.println(String.format("%s@%s",
                repeatStr(" ", leftRight),
                repeatStr(" ", leftRight)));

        //print the lower wings
        for (int i = 0; i < rows / 2; i++) {
            if (i % 2 == 0) {
                System.out.println(String.format("%s/ \\%s",
                        repeatStr("*", leftRight - 1),
                        repeatStr("*", leftRight - 1)));

            } else {
                System.out.println(String.format("%s/ \\%s",
                        repeatStr("-", leftRight - 1),
                        repeatStr("-", leftRight - 1)));

            }
        }
    }
}
