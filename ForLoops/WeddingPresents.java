package ForLoops;

import java.util.Scanner;

public class WeddingPresents {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int guests = Integer.parseInt(scan.nextLine());
        int gifts = Integer.parseInt(scan.nextLine());
        int A = 0, B = 0, V = 0, G = 0;

        for (int i = 0; i < gifts; i++) {
            char ch = scan.next().charAt(0);

            if (ch == 'A') {
                A++;
            } else if (ch == 'B') {
                B++;
            } else if (ch == 'V') {
                V++;
            } else if (ch == 'G') {
                G++;
            }
        }
        double avgA = (A * 100.0) / gifts, avgB = (B * 100.0) / gifts, avgV = (V * 100.0) / gifts, avgG = (G * 100.0) / gifts;
        double giftGuest = (gifts * 100.0) / guests;

        System.out.printf("%.2f%%%n", avgA);
        System.out.printf("%.2f%%%n", avgB);
        System.out.printf("%.2f%%%n", avgV);
        System.out.printf("%.2f%%%n", avgG);
        System.out.printf("%.2f%%", giftGuest);

    }
}
