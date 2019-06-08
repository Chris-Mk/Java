package ForLoops;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfBalls = Integer.parseInt(scan.nextLine());
        int redBalls = 0, orangeBalls = 0, yellowBalls = 0, whiteBalls = 0, blackBalls = 0, others = 0;
        int points = 0;

        for (int i = 0; i < numberOfBalls; i++) {
            String ballColour = scan.nextLine();

            if (ballColour.equals("red")) {
                points += 5;
                redBalls ++;
            } else if (ballColour.equals("orange")) {
                points += 10;
                orangeBalls++;
            } else if (ballColour.equals("yellow")) {
                points += 15;
                yellowBalls ++;
            } else if (ballColour.equals("white")) {
                points += 20;
                whiteBalls++;
            } else if (ballColour.equals("black")) {
                points /= 2;
                blackBalls++;
            } else {
                others++;
            }
        }
        System.out.println("Total points: " + points);
        System.out.println("Points from red balls " + redBalls);
        System.out.println("Points from orange balls " + orangeBalls);
        System.out.println("Points from yellow balls " + yellowBalls);
        System.out.println("Points from white balls " + whiteBalls);
        System.out.println("Other colors picked: " + others);
        System.out.println("Divides from black balls: " + blackBalls);
    }
}
