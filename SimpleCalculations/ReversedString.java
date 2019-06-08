import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(scan.nextLine());
        StringBuilder reversed = builder.reverse();

        System.out.println(reversed);
    }
}
