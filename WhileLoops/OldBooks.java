import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int capacity = Integer.parseInt(scan.nextLine());
        boolean found = false;

        int counter = 0;
        while (!found && counter < capacity) {
            found = name.equals(scan.nextLine());
            counter++;
        }
        if (found) {
            System.out.printf("You checked %d books and found it.", --counter);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", counter);
        }
    }
}
