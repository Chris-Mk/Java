package productNumbers;

import java.util.Scanner;

public class ProductNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        int n = scan.nextInt();
        System.out.print("m = ");
        int m = scan.nextInt();
        int num = n;
        long product = 1;

        do {
            product *= num;
            num++;
        } while (num <= m);
        System.out.println("product[n..m] = " + product);
    }
}
