package MagicalNumbers;

import java.util.Scanner;

public class MagicalNumbersPt2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int magicNumber = Integer.parseInt(scan.nextLine());
        int d1 = 1, d2, d3, d4, d5, d6;

        while (d1 <= 9) {
            d2 = 1;
            while (d2 <= 9) {
                d3 = 1;
                while (d3 <= 9) {
                    d4 = 1;
                    while (d4 <= 9) {
                        d5 = 1;
                        while (d5 <= 9) {
                            d6 = 0;
                            while (d6 <= 9) {
                                if (d1 * d2 * d3 * d4 * d5 * d6 == magicNumber) {
                                    System.out.printf("%d%d%d%d%d%d%n", d1, d2 ,d3, d4, d5, d6);
                                }
                                d6++;
                            }
                            d5++;
                        }
                        d4++;
                    }
                    d3++;
                }
                d2++;
            }
            d1++;
        }
    }
}
