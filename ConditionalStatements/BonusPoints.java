import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;

        if (num % 2 == 0) {
            bonusPoints += 1;
        } else if (num % 5 == 0) {
            bonusPoints += 2;
        }

        if (num <= 100) {
            bonusPoints += 5;
        } else if (num > 100 && num < 1000) {
            bonusPoints += num * 0.2;
        } else if (num > 1000) {
            bonusPoints += num * 0.1;
        }
        System.out.println(bonusPoints);
        System.out.println(num + bonusPoints);
    }
}
