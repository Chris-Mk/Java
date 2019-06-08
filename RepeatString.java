import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int times = Integer.parseInt(scan.nextLine());

        System.out.println(printRepeatedString(text, times));
    }

    private static String printRepeatedString(String text, int times) {
        String repeatedString = "";
        for (int i = 0; i < times; i++) {
            repeatedString += text;
        }

        return repeatedString;
    }
}
