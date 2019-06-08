import java.util.Scanner;

public class EqualNums {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        int x = print.nextInt();
        int y = print.nextInt();
        int z = print.nextInt();

        if (x == y && x == z) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}