import java.util.Scanner;

public class WaterDispenser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cupVolume = Integer.parseInt(scan.nextLine());
        int countTap = 0;
        int fillStatus = 0;

        while (fillStatus < cupVolume) {
            String button = scan.nextLine();
            switch (button) {
                case "Easy":
                    fillStatus += 50;
                    countTap++;
                    break;
                case "Medium":
                    fillStatus += 100;
                    countTap++;
                    break;
                case "Hard":
                    fillStatus += 200;
                    countTap++;
                    break;
            }

            if (fillStatus > cupVolume) {
                System.out.printf("%dml has been spilled.", fillStatus - cupVolume);
                return;
            } else if (fillStatus == cupVolume) {
                System.out.printf("The dispenser has been tapped %d times.", countTap);
                return;
            }
        }
    }
}
