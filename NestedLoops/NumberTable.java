import java.util.Scanner;

public class NumberTable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int rows = 1; rows <= n; rows++) {
            int num = rows;
            int num2 = n;
            for (int columns = 1; columns <= n; columns++) {
                if (num > n) {
                    num2--;
                    System.out.print(num2 + " ");
                } else {
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println(" ");
        }
    }
}