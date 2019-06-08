import java.util.Scanner;

public class DrawFort {
    private static String repeatStr(String symbol, int counter) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < counter; i++) {
            builder.append(symbol);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int colSize = n / 2;
        int midSize = 2 * n - 2 * colSize - 4;

        //print the roof
        String underscores = repeatStr("_", midSize);
        String arrows = repeatStr("^", colSize);
        System.out.println(String.format("/%s\\%s/%s\\", arrows, underscores, arrows));

        //print the middle
        for (int i = 1; i <= n - 3; i++) {
            System.out.println(String.format("|%s|", repeatStr(" ", 2 * n - 2)));
        }

        String sideSpace = repeatStr(" ", colSize + 1);
        System.out.println(String.format("|%s%s%s|", sideSpace, underscores, sideSpace));

        //print the bottom
        String middleSpaces = repeatStr(" ", midSize);
        underscores = repeatStr("_", colSize);
        System.out.println(String.format("\\%s/%s\\%s/", underscores, middleSpaces, underscores));
    }
}