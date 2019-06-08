package factorials;

import java.util.Scanner;

public class Factorial3 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        long factorial = 1;

        while (n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println(factorial);
    }
}
