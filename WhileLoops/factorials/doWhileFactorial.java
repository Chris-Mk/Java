package factorials;

import java.util.Scanner;

public class doWhileFactorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        long factorial = 1;

        do {
            factorial *= n;
            n--;
        } while (n > 0);
        System.out.println(factorial);
    }
}
