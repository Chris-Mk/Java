import java.util.Scanner;

public class DistanceBetweenTwoMonths {
    private static void sayMonth(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
                default:
                    System.out.println("Error!");
                    break;
        }
        System.out.print(monthName);
    }

    private static void sayPeriod(int startMonth, int endMonth) {
        int period =  endMonth - startMonth;

        if (period < 0) {
            period += 12;
        }
        System.out.printf("There is %d months from ", period);
        sayMonth(startMonth);
        System.out.print(" to ");
        sayMonth(endMonth);
        System.out.print(".");

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("First Month (1-12): ");
        int firstMonth = Integer.parseInt(scan.nextLine());

        System.out.print("Second Month (1-12): ");
        int secondMonth = Integer.parseInt(scan.nextLine());

        sayPeriod(firstMonth, secondMonth);
    }
}
