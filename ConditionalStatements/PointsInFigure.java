import java.util.Scanner;

public class PointsInFigure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        boolean outRect1 = x < h || x > 2*h || y > 4*h || y < h;
        boolean outRect2 = x < 0 || x > 3*h || y < 0 || y > h;

        boolean inRect1 = x > h && x < 2*h && y < 4*h && y > h;
        boolean inRect2 = x > 0 && x < 3*h && y > 0 && y < h;

        boolean commonBorder = x > h && x < 2*h && y == h ;

        if (outRect1 && outRect2) {
            System.out.println("outside");
        } else if (inRect1 || inRect2 || commonBorder){
            System.out.println("inside");
        } else {
            System.out.println("border");
        }
    }
}
