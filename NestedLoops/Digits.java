import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int fD = num / 100;
        int secD = num / 10;
        int sD = secD % 10;
        int lD = num % 10;
        int rows = fD + sD;
        int columns = fD + lD;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (num % 5 == 0) {
                    num -= fD;
                } else if (num % 3 == 0) {
                    num -= sD;
                } else {
                    num += lD;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
