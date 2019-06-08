import java.util.Scanner;

public class EnterEvenNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        while (true){
            System.out.print("Enter even number: ");
            n = Integer.parseInt(scan.nextLine());
            if (n % 2 == 0) {
                System.out.printf("Even number entered: %d.", n);
                break;
            }
            System.out.println("The number is not even.");
        }
    }
}
