import java.util.Scanner;

public class StupidPasswordGenerator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int ch = 97; ch < 97 + l; ch++) {
                    for (int sy = 97; sy < 97 + l; sy++) {
                        for (int k = 1; k <= n; k++) {
                            if (k > i && k > j) {
                                System.out.print("" + i + j + (char)ch + (char)sy + k + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}