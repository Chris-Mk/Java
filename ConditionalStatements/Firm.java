import  java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hours = Integer.parseInt(in.nextLine());
        int days = Integer.parseInt(in.nextLine());
        int employees = Integer.parseInt(in.nextLine());

        double noneWorkingDays = .1 * days;
        double workingDays = days - noneWorkingDays;
        double workingHours = 8 * workingDays * employees;
        double employeesHrs = employees * 2;
        double employHrsForWorkingDays = employeesHrs * workingDays;
        double hrDiff = Math.abs(hours - employHrsForWorkingDays);

        if (workingHours <= hours) {
            System.out.printf("Yes!%.0f hours left.", Math.floor(hrDiff));
        } else {
            System.out.printf("Not enough time!%.0f hours needed", Math.floor(hrDiff));
        }
    }
}
