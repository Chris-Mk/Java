import java.util.Scanner;

public class StringRepeater {
    private static void repeatString(String str, int count) {
        String repeatedString = str.repeat(count);
        System.out.println(repeatedString);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int counter = Integer.parseInt(scan.nextLine());
        repeatString(s, counter);
    }
}
