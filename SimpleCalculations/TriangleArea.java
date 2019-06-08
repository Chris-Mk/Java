package SimpleCalculations;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1 = Integer.parseInt(scan.nextLine());
        int y1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int y2 = Integer.parseInt(scan.nextLine());
        int x3 = Integer.parseInt(scan.nextLine());
        int y3 = Integer.parseInt(scan.nextLine());

        int base = Math.abs(x2 - x3);
        int height = Math.abs(y1 - y2);
        double area = (double) (base * height) / 2;
        System.out.println(area);
    }
}
