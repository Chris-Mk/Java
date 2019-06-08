import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        double expenses = (lostGames / 2) * headsetPrice +
                            (lostGames / 3) * mousePrice +
                            (lostGames / 6) * keyboardPrice +
                            (lostGames / 12) * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
