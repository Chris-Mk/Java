import java.util.Scanner;

public class HelloName {
    private static void printName(String name) {
        System.out.printf("Hello, %s!", name);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String readName = scan.nextLine();
        printName(readName);
    }
}
