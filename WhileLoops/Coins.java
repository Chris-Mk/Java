import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine()) * 100;
        int count = 0;

        while (money > 0) {
            if (money >= 200) {
                money -= 200;
                count += 1;
            } else if (money >= 100) {
                money -= 100;
                count += 1;
            } else if (money >= 50) {
                money -= 50;
                count += 1;
            } else if (money >= 20) {
                money -= 20;
                count += 1;
            } else if (money >= 10) {
                money -= 10;
                count += 1;
            } else if (money >= 5) {
                money -= 5;
                count += 1;
            } else if (money >= 2) {
                money -= 2;
                count += 1;
            } else if (money >= 1) {
                --money;
                count += 1;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
