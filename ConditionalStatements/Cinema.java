import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String screenType = scan.nextLine().toLowerCase();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        double revenue = 0.0d;

        switch (screenType) {
            case "premiere":
                revenue = rows * columns * 12.00;
                break;
            case "normal":
                revenue = rows * columns * 7.50;
                break;
            case "discount":
                revenue = rows * columns * 5.00;
                break;
        }
        System.out.printf("%.2f leva", revenue);
    }
}
