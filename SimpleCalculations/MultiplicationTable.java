import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int times = Integer.parseInt(scan.nextLine());

        do {
            System.out.println(String.format("%d X %d = %d", number, times, number * times));
            times++;
        } while (times <= 10);
    }
}
