import java.util.Scanner;
public class DanceHall {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double drobeSide = Double.parseDouble(scanner.nextLine());

        double hallArea =  ((length * 100) * (width * 100));
        double drobeArea =  ((drobeSide * 100) * (drobeSide * 100));
        double benchArea = hallArea / 10;
        double freeArea = hallArea - drobeArea - benchArea;
        double dancers = freeArea / (40 + 7000);
        double down = Math.floor(dancers);

        System.out.printf("%.0f", down);
    }
}
