import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordTime = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double totalTime = distance * timePerMeter;
        double dragTime = Math.floor(distance / 15);
        double product = dragTime * 12.5;
        double excateTime = totalTime + product;
        double timeDifference = excateTime - recordTime;

        if (excateTime < recordTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", excateTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeDifference);
        }
    }
}
