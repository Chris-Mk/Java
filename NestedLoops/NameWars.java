import java.util.Scanner;

public class NameWars {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int maxCombination = Integer.MIN_VALUE;
        int currentSum;
        String winner = "";

        while (!name.equals("STOP")) {
            currentSum = 0;
            for (int i = 0; i < name.length(); i++) {
                currentSum += name.charAt(i);
            }

            if (currentSum > maxCombination) {
                maxCombination = currentSum;
                winner = name;
            }
            name = scan.nextLine();
        }
        System.out.printf("Winner is %s - %d!", winner, maxCombination);
    }
}
