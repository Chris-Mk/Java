package NestedLoops;

import java.util.Scanner;

public class Substitute {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        int counter = 0;

        for (int i = k; i <= 8; i++) {
            for (int j = 9; j >= l; j--) {
                for (int o = m; o <= 8; o++) {
                    for (int p = 9; p >= n; p--) {
                        if ((i % 2 == 0 && j % 2 != 0) && (o % 2 == 0 && p % 2 != 0)){
                            if (counter == 6){
                                continue;
                            }
                            if (i == o && j == p){
                                System.out.printf("Cannot change the same player.%n");
                            }else{
                                System.out.printf("%d%d - %d%d%n", i, j, o, p);
                                counter++;
                            }
                        }
                    }
                }
            }
        }
    }
}
