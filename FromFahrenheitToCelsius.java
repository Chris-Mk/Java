import java.util.Scanner;

public class FromFahrenheitToCelsius {
    private static void checkForIllness(double bodyTemp) {
        if (bodyTemp > 37) {
            System.out.println("You are ill!");
        }
    }

    private static void getTempInCelsius(double fahrenheitTemperature) {
        double celsiusTemperature = (fahrenheitTemperature - 32) * 5/9;

        System.out.println("Your body temperature in Celsius degrees is " + celsiusTemperature);
        if (celsiusTemperature > 37) {
            checkForIllness(celsiusTemperature);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your body temperature in Fahrenheit degrees:");
        double temperature = Double.parseDouble(scan.nextLine());
        getTempInCelsius(temperature);
    }
}
