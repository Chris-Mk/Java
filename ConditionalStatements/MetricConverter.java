import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double magnitude = Double.parseDouble(scanner.nextLine());
        String inputUnits = scanner.nextLine();
        String outputUnits = scanner.nextLine();

        if (inputUnits.equals("mm")) {
            magnitude = magnitude / 1000;
        } else if(inputUnits.equals("cm")) {
            magnitude = magnitude / 100;
        } else if(inputUnits.equals("mi")) {
            magnitude = magnitude / 0.000621371192;
        } else if(inputUnits.equals("in")) {
            magnitude = magnitude / 39.3700787;
        } else if(inputUnits.equals("km")) {
            magnitude = magnitude / 0.001;
        } else if(inputUnits.equals("ft")) {
            magnitude = magnitude / 3.2808399;
        } else if(inputUnits.equals("yd")) {
            magnitude = magnitude / 1.0936133;
        }

        if(outputUnits.equals("mm")){
            magnitude = magnitude * 1000;
        } else if(outputUnits.equals("cm")) {
            magnitude = magnitude * 100;
        } else if(outputUnits.equals("mi")) {
            magnitude = magnitude * 0.000621371192;
        } else  if(outputUnits.equals("in")) {
            magnitude = magnitude * 39.3700787;
        } else if(outputUnits.equals("km")) {
            magnitude = magnitude * 0.001;
        } else if(outputUnits.equals("ft")) {
            magnitude = magnitude * 3.2808399;
        } else if(outputUnits.equals("yd")) {
            magnitude = magnitude * 1.0936133;
        }
        System.out.printf("%.8f", magnitude);
    }
}
