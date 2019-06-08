import java.util.Scanner;

public class PointOnBoarder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x1 = Integer.parseInt(console.nextLine());
        int y1 = Integer.parseInt(console.nextLine());
        int x2 = Integer.parseInt(console.nextLine());
        int y2 = Integer.parseInt(console.nextLine());
        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());

        if (((x == x1 || x == x2 ) && (y >= y1 && y <= y2 ))) {
            System.out.println("Border");
        } else if ((y == y1 || y == y2) && (x >= x1 && x <= x2)){
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
