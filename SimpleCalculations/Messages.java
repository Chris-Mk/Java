import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        int mainDigit = 0;
        for (int i = 0; i < number; i++) {
            String num = scan.nextLine();

            if (num.contains("2")) {
                mainDigit = 2;
            } else if (num.contains("3")) {
                mainDigit = 3;
            } else if (num.contains("4")) {
                mainDigit = 4;
            } else if (num.contains("5")) {
                mainDigit = 5;
            } else if (num.contains("6")) {
                mainDigit = 6;
            } else if (num.contains("7")) {
                mainDigit = 7;
            } else if (num.contains("8")) {
                mainDigit = 8;
            } else if (num.contains("9")) {
                mainDigit = 9;
            } else if (num.contains("0")) {
                mainDigit = 0;
            }

            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }

            int letterIndex = offset + num.length() - 1;
            char ch = (char) ('a' + letterIndex);

            if (mainDigit == 0) {
                System.out.print(" ");
            } else {
                System.out.print(ch);
            }
        }
    }
}
