package ForLoops;

import java.util.Scanner;

public class RectangleWithStars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("%");
        }

        System.out.println("%");

        for (int j = 0; j < n - 1; j++) {
            System.out.print(" ");
        }
    }
}
