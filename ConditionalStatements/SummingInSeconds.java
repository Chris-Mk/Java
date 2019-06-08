import java.util.Scanner;

public class SummingInSeconds {
    public static void main(String []args) {

        Scanner console = new Scanner(System.in);
        int racer1 = console.nextInt();
        int racer2 = console.nextInt();
        int racer3 = console.nextInt();

        int totalSeconds = racer1 + racer2 + racer3;
        int secs = totalSeconds % 60;
        int mins = totalSeconds / 60;

        if (totalSeconds >= 60) {
            System.out.print(mins);
        } else if (totalSeconds < 60) {
            System.out.print("0");
        }

        if (secs < 10){
            System.out.println(":0" + secs);
        } else if (secs >= 10) {
            System.out.println(":" + secs);
        }
    }
}
