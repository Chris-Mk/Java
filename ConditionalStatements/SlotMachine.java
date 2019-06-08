package ConditionalStatements;

import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        char n = s1.charAt(0);
        int n1 = Integer.parseInt(scan.nextLine());

        String s2 = scan.nextLine();
        char m = s2.charAt(0);
        int m1 = Integer.parseInt(scan.nextLine());

        String s3 = scan.nextLine();
        char k = s3.charAt(0);
        int k1 = Integer.parseInt(scan.nextLine());

        int sum1 = n + n1, sum2 = m + m1, sum3 = k + k1;
        System.out.printf("%c", sum1);
        System.out.printf("%c", sum2);
        System.out.printf("%c", sum3);

        System.out.println();
        if (sum1 == '@' && sum2 == '@' && sum3 == '@') {
            System.out.println("!!! YOU LOSE EVERYTHING !!!");
        } else if (sum1 == '7' && sum2 == '7' && sum3 == '7') {
            System.out.println("*** JACKPOT ***");
        }
    }
}
