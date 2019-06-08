import java.util.Scanner;

public class ValidationOfData {
    private static boolean validateHours(int hours) {
        return (hours >= 0 && hours <= 23);
    }

    private static boolean validateMinutes(int minutes) {
        return (minutes >= 0 && minutes <= 59);
    }

    public static void main(String[] args) {
        System.out.println("What time is it?");
        Scanner scan = new Scanner(System.in);

        System.out.print("Hours: ");
        int hours = Integer.parseInt(scan.nextLine());

        System.out.print("Minutes: ");
        int minutes = Integer.parseInt(scan.nextLine());

        boolean isTimeValid = validateHours(hours) && validateMinutes(minutes);
        if (isTimeValid) {
            if (hours < 10 && minutes >= 10) {
                System.out.printf("The time is 0%d:%d now.%n", hours, minutes);
            } else if (minutes < 10 && hours >= 10) {
                System.out.printf("The time is %d:0%d now.%n", hours, minutes);
            } else if (hours >= 10 && minutes >= 10) {
                System.out.printf("The time is %d:%d now.%n", hours, minutes);
            } else {
                System.out.printf("The time is 0%d:0%d now.%n", hours, minutes);
            }
        } else {
            System.out.println("Incorrect time!");
        }
    }
}
