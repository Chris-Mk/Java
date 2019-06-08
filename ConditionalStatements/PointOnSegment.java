package ConditionalStatements;

import java.util.Scanner;

public class PointOnSegment {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstEnd = Integer.parseInt(scan.nextLine());
        int secondEnd = Integer.parseInt(scan.nextLine());
        int point = Integer.parseInt(scan.nextLine());

        int leftEnd = Math.min(firstEnd, secondEnd);
        int rightEnd = Math.max(firstEnd, secondEnd);
        int distanceLeft = Math.abs(leftEnd - point);
        int distanceRight = Math.abs(rightEnd - point);
        int minDistance = Math.min(distanceLeft, distanceRight);

        if (leftEnd <= point && rightEnd >= point) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
        System.out.println(minDistance);
    }
}
