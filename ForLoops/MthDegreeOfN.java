import java.util.Scanner;

public class MthDegreeOfN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = Integer.parseInt(scan.nextLine());
        System.out.print("m = ");
        int m = Integer.parseInt(scan.nextLine());
        long result = 1;

        for (int i = 0; i < m ; i++) {
            result *= n;
        }
        System.out.println("n ^ m = " + result);
    }
}
