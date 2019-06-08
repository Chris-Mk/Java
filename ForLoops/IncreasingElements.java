package ForLoops;

import java.util.Scanner;

public class IncreasingElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int countCurrentLongest = 0;
        int countLongest = 0;
        int prevNum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num > prevNum) {
                countCurrentLongest++;
            } else {
                countCurrentLongest = 1;
            }

            if (countCurrentLongest > countLongest) {
                countLongest = countCurrentLongest;
            }
            prevNum = num;
        }
        System.out.println(countLongest);
    }
}
