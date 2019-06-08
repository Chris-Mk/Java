import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int degrees = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine().toLowerCase();

        if (degrees >= 10 && degrees <= 18) {
            if (dayTime.equals("morning")) {
                System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degrees);
            } else if (dayTime.equals("afternoon")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
            } else if (dayTime.equals("evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
            }
        } else if (degrees > 18 && degrees <= 24) {
            if (dayTime.equals("morning")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
            } else if (dayTime.equals("afternoon")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
            } else if (dayTime.equals("evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
            }
        } else if (degrees >= 25) {
            if (dayTime.equals("morning")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
            } else if (dayTime.equals("afternoon")) {
                System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", degrees);
            } else if (dayTime.equals("evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
            }
        }
    }
}