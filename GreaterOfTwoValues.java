import java.util.Scanner;

public class GreaterOfTwoValues {
    private static int getMax(int num1, int num2) {
        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
    }

    private static char getMax(char ch1, char ch2) {
        if (ch1 >= ch2) {
            return ch1;
        } else {
            return ch2;
        }
    }

    private static String getMax(String str1, String str2) {
        if (str1.compareTo(str2) >= 0) {
            return str1;
        } else {
            return str2;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dataType = scan.nextLine();

        if (dataType.equals("int")) {
            int n1 = Integer.parseInt(scan.nextLine());
            int n2 = Integer.parseInt(scan.nextLine());
            int max = getMax(n1, n2);
            System.out.println(max);
        } else if (dataType.equals("char")) {
            char sy1 = scan.next().charAt(0);
            char sy2 = scan.next().charAt(0);
            char max = getMax(sy1, sy2);
            System.out.println(max);
        } else if (dataType.equals("string")) {
            String s1 = scan.nextLine();
            String s2 = scan.nextLine();
            String max = getMax(s1, s2);
            System.out.println(max);
        }
    }
}
