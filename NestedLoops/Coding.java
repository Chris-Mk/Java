import java.util.Scanner;

public class Coding {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        StringBuffer output;

        for (int rows = 1; rows <= n;) {
            int num = n % 10;
            int num2 = n / 10;
            if (num == 0) {
                output = new StringBuffer("ZERO");
            } else {
                output = new StringBuffer();
                for (int columns = 1; columns <= num; columns++) {
                    output.append((char)(num + 33));
                }
            }
            n = num2;
            System.out.println(output);
        }
    }
}