import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int area = width * length;
        String command = scan.nextLine();

        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            area -= pieces;

            if (area < 0) {
                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(area));
                return;
            }

            command = scan.nextLine();
        }
        System.out.printf("%d pieces are left.", area);
    }
}
