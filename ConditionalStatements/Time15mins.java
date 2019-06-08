import java.util.Scanner;

public class Time15mins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMins = minutes + 15;
        int hr = totalMins / 60;
        int min = totalMins % 60;
        int totalHrs = hr + hours;

        if (totalHrs > 23) {
            totalHrs = 0;
        }

        if (totalMins >= 60) {
            if (min < 10) {
                System.out.println(totalHrs + ":0" + min);
            } else if (min >= 10) {
                System.out.println(totalHrs + ":" + min);
            }
        } else if (totalMins < 60) {
            if (totalMins < 10) {
                System.out.println(hours + ":0" + totalMins);
            } else if (totalMins >= 10) {
                System.out.print(hours + ":" + totalMins);
            }
        }


    }
}