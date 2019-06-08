package LuckyNumbers;

import java.util.Scanner;

public class LuckyNumbers {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int ones = 0;
        int tens = 0;
        int hundreds = 0;
        int thousands = 0;

        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    for (int l = 0; l < k; l++) {
                        ones = num % 10;
                    }
                    tens = num % 100;
                    tens = tens / 10;
                }
                hundreds = num % 1000;
                hundreds = hundreds / 100;
            }
            thousands = num % 10000;
            thousands = thousands / 1000;
        }

        int sum1 = ones + tens;
        int sum2 = hundreds + thousands;

        if (sum1 == sum2) {
            System.out.printf("%d is a lucky number!", num);
        } else {
            System.out.printf("%d is NOT a lucky number.", num);
        }
    }
}
