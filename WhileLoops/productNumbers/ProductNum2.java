package productNumbers;

import java.util.Scanner;

public class ProductNum2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int product = 1;

        do {
            product *= n;
            n++;
        } while (n <= m);
        System.out.println(product);
    }
}
