import java.util.Scanner;

public class SeveralVariables {
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        for (int small = 1, large = 10; small < large; small++, large--) {
            System.out.printf("%d %d%n", small, large);
        }
    }
}
