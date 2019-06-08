import java.util.Scanner;

public class Arrow {
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

        int sideDots = n / 2;

        //prints the first single line
        System.out.println(String.format("%s%s%s",
                repeatStr(".", sideDots),
                repeatStr("#", n),
                repeatStr(".", sideDots)));

        //prints the rest of the top part
        for (int i = 0; i < n - 2; i++) {
            System.out.println(String.format("%s#%s#%s",
                    repeatStr(".", sideDots),
                    repeatStr(".", n - 2),
                    repeatStr(".", sideDots)));
        }

        //prints the middle row
        System.out.println(String.format("%s#%s#%s",
                repeatStr("#", sideDots),
                repeatStr(".", n - 2),
                repeatStr("#", sideDots)));
        
        //prints the bottom part but not the last row
        int count = 5;
        for (int i = 1; i <= n - 2; i++) {
            System.out.println(String.format("%s#%s#%s",
                    repeatStr(".", i),
                    repeatStr(".", n * 2 - count),
                    repeatStr(".", i)));
            count += 2;
        }

        //prints the last row
        System.out.println(String.format("%s#%s",
                repeatStr(".", n -1),
                repeatStr(".", n - 1)));
    }
}
