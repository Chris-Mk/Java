package ConditionalStatements;

import java.util.Scanner;

public class DateAfter5Days {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int day = Integer.parseInt(scan.nextLine());
        int month = Integer.parseInt(scan.nextLine());
        int dayAfter5Days = day + 5;
        int daysOfAMonth = 31;

        if (month == 2) {
            daysOfAMonth = 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysOfAMonth = 30;
        }

        if (dayAfter5Days > daysOfAMonth) {
            dayAfter5Days -= daysOfAMonth;
            month++;
        }

        if (month > 12) {
            month = 1;
        }
        System.out.printf("%d.%02d", dayAfter5Days, month);
    }
}
