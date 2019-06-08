import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String dataType = scan.nextLine();
        String data = scan.nextLine();

        switch (dataType) {
            case "int": {
                int number = Integer.parseInt(data);
                System.out.println(manipulateDataType(number));
                break;
            }
            case "real": {
                double number = Double.parseDouble(data);
                System.out.printf("%.2f", manipulateDataType(number));
                break;
            }
            case "string":
                System.out.println(manipulateDataType(data));
                break;
        }
    }

    static int manipulateDataType(int number) {
        return number * 2;
    }

    static double manipulateDataType(double number) {
        return number * 1.5;
    }

    static String manipulateDataType(String data) {
        return "$" + data + "$";
    }
}
