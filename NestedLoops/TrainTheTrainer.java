import java.util.Scanner;

public class TrainTheTrainer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jury = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        double sum = 0;
        double sum2 = 0;
        double avg;
        double counter = 0;

        while (!command.equals("Finish")) {
            for (int i = 1; i <= jury; i++) {
                double assessment = Double.parseDouble(scan.nextLine());
                sum += assessment;
                sum2 += assessment;
                counter++;
            }
            avg = sum / jury;
            System.out.printf("%s - %.2f.%n", command, avg);
            sum = 0;
            command = scan.nextLine();
        }
        double finalAvg = sum2 / counter;
        System.out.printf("Student's final assessment is %.2f.", finalAvg);
    }
}
