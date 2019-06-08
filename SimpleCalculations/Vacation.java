import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();
        double price = 0;

        if (type.equals("Business") && people >= 100) {
            people -= 10;
        }

        switch (day) {
            case "Friday":
                switch (type) {
                    case "Students":
                        price = 8.45;
                        break;
                    case "Business":
                        price = 10.90;
                        break;
                    case "Regular":
                        price = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        price = 9.80;
                        break;
                    case "Business":
                        price = 15.60;
                        break;
                    case "Regular":
                        price = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        price = 10.46;
                        break;
                    case "Business":
                        price = 16;
                        break;
                    case "Regular":
                        price = 22.50;
                        break;
                }
                break;
        }
        price *= people;

        if (type.equals("Students") && people >= 30) {
            price *= .85;
        } else if (type.equals("Regular") && (people >= 10 && people <= 20)) {
            price *= .95;
        }

        System.out.printf("Total price: %.2f%n", price);
    }
}