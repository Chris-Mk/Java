import java.util.Scanner;

public class Fishing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quota = Integer.parseInt(scan.nextLine());
        double money;
        double amt = 0;
        double sum = 0;
        int counter = 0;
        int fishCount = 0;

        while (counter < quota) {
            String fishName = scan.nextLine();
            if (fishName.equals("Stop")) {
                break;
            }

            double fishWeight = Double.parseDouble(scan.nextLine());
            counter++;
            fishCount++;

            for (int i = 0; i < fishName.length(); i++) {
                char symbol = fishName.charAt(i);
                sum += symbol;
            }

            money = sum / fishWeight;
            sum = 0;

            if (fishCount < 3) {
                amt -= money;
            } else {
                amt += money;
                fishCount = 0;
            }
        }

        if (counter == quota) {
            System.out.println("Lyubo fulfilled the quota!");
        }

        if (amt > 0) {
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", counter, amt);
        } else {
            System.out.printf("Lyubo lost %.2f leva today.", Math.abs(amt));
        }
    }
}
