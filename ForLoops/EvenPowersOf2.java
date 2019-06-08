import java.util.Scanner;

public class EvenPowersOf2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double result = 1;

        for (int i = 0; i <= n; i += 2) {
            result = Math.pow(2 , i);
            System.out.printf("%.0f%n",result);
        }
    }
}