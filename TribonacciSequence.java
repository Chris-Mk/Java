import java.util.Arrays;
import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int[] series = getTribonacciSeries(num);

        String result = "";
        for (int i = 0; i < series.length; i++) {
            result += series[i] + " ";
        }

        System.out.println(result.trim());
    }

    private static int[] getTribonacciSeries(int num) {
        int[] triboSeries = new int[num];
        triboSeries[0] = 1;
        triboSeries[1] = 1;
        triboSeries[2] = 2;

        for (int i = 3; i < num; i++) {
            int nextTribo = triboSeries[i - 3] + triboSeries[i - 2] + triboSeries[i - 1];
            triboSeries[i] = nextTribo;
        }

        return triboSeries;
    }
}
