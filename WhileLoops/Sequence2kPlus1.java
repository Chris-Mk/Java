import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = 1;
        while (k <= n) {
            System.out.println(k);
            k = 2 * k + 1;
        }
    }
}
