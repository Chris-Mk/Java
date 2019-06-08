import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = Double.parseDouble(scanner.nextLine());
        double B = Double.parseDouble(scanner.nextLine());
        double C = Double.parseDouble(scanner.nextLine());
        double D = Double.parseDouble(scanner.nextLine());

        double totalTime = 1 / (1/A + 1/B + 1/C);
        double activeTime = totalTime + totalTime * 0.15;
        double timeLeft = D - activeTime;

        System.out.printf("Cleaning time: %.2f%n", activeTime);
        if (timeLeft > 0) {
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(timeLeft));
        } else {
            timeLeft = Math.abs(timeLeft);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(timeLeft));
        }
    }
}
