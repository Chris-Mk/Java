
import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double steps =Double.parseDouble(input.nextLine());
        double dancers = Double.parseDouble(input.nextLine());
        double days = Double.parseDouble(input.nextLine());

        double stepsPerDay = ((steps/days) / steps) * 100;
        double roundedSteps = Math.ceil(stepsPerDay);
        double percentageStepsForEachDancer = roundedSteps / dancers;

        if(roundedSteps <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", percentageStepsForEachDancer);
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", percentageStepsForEachDancer);
        }
    }
}
