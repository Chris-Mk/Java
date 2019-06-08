package ForLoops;

import java.util.Scanner;

public class HogsWatch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int homes = Integer.parseInt(scan.nextLine());
        int initialPresents = Integer.parseInt(scan.nextLine());
        int wentBack = 0, additionalPresents = 0;
        int currentPresents = initialPresents;

        for (int i = 1; i <= homes; i++) {
            int childrenPerHouse = Integer.parseInt(scan.nextLine());
            initialPresents -= childrenPerHouse;

            if (initialPresents < 0) {
                int morePresents = (currentPresents / i) * (homes - i) + Math.abs(initialPresents);
                additionalPresents += morePresents;
                initialPresents = morePresents + initialPresents;
                wentBack++;
            }
        }

        if (wentBack == 0) {
            System.out.println(initialPresents);
        } else {
            System.out.println(wentBack);
            System.out.println(additionalPresents);
        }
    }
}
