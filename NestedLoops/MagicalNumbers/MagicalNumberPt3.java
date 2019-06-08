package MagicalNumbers;

import java.util.Scanner;

public class MagicalNumberPt3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int magicNumber = Integer.parseInt(scan.nextLine());
        int d1 = 0;

        while (true) {
            int d2 = 0;
            while (true) {
                int d3 = 0;
                while (true) {
                    int d4 = 0;
                    while (true) {
                        int d5 = 0;
                        while (true) {
                            int d6 = 0;
                            while (true) {
                                if (d1 * d2 * d3 * d4 * d5 * d6 == magicNumber) {
                                    System.out.println( "" + d1 + d2 + d3 + d4 + d5 + d6);
                                }
                                d6++;
                                if (d6 == 10) break;
                            }
                            d5++;
                            if (d5 == 10) break;
                        }
                        d4++;
                        if (d4 == 10) break;
                    }
                    d3++;
                    if (d3 == 10) break;
                }
                d2++;
                if (d2 == 10) break;
            }
            d1++;
            if (d1 == 10) break;
        }
    }
}
