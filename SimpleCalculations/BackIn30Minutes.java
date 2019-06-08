import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int totalMinutes = hours * 60 + minutes + 30;
        int newHours = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        if (newHours > 23) {
            newHours = 0;
        }

        System.out.printf("%d:%02d", newHours, newMinutes);
    }
}
