import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x1 = Integer.parseInt(scan.nextLine());
        int y1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int y2 = Integer.parseInt(scan.nextLine());
        int x3 = Integer.parseInt(scan.nextLine());
        int y3 = Integer.parseInt(scan.nextLine());
        int x4 = Integer.parseInt(scan.nextLine());
        int y4 = Integer.parseInt(scan.nextLine());

        if (isLongest(x1, y1, x2, y2, x3, y3, x4, y4).equals("x1y1")) {
            System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
        } else if (isLongest(x1, y1, x2, y2, x3, y3, x4, y4).equals("x2y2")) {
            System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        }  else if (isLongest(x1, y1, x2, y2, x3, y3, x4, y4).equals("x3y3")) {
            System.out.printf("(%d, %d)(%d, %d)", x3, y3, x4, y4);
        }  else if (isLongest(x1, y1, x2, y2, x3, y3, x4, y4).equals("x4y4")) {
            System.out.printf("(%d, %d)(%d, %d)", x4, y4, x3, y3);
        }

    }

    static String isLongest(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double lengthOfTheFirstLine = Math.sqrt(Math.pow(x1 - x2, 2) - Math.pow(y1 - y2, 2));
        double lengthOfTheSecondLine = Math.sqrt(Math.pow(x3 - x4, 2) - Math.pow(y3 - y4, 2));
        String coordPoints = "";

        if (lengthOfTheFirstLine >= lengthOfTheSecondLine) {
            if (isClosest(x1, y1, x2, y2)) {
                coordPoints = "x1y1";
            }
            coordPoints = "x2y2";
        } else {
            if (isClosest(x3, y3, x4, y4)) {
                coordPoints = "x3y3";
            } else {
                coordPoints = "x4y4";
            }
        }

        return coordPoints;
    }

    static boolean isClosest(int x1, int y1, int x2, int y2) {
        double distance1 = Math.sqrt(Math.pow(x1, 2) - Math.pow(y1, 2));
        double distance2 = Math.sqrt(Math.pow(x2, 2) - Math.pow(y2, 2));

        return distance1 >= distance2;
    }
}
