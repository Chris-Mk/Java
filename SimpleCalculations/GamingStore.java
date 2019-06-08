import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        String game = scan.nextLine();
        double spent = 0;

        while (!game.equals("Game Time")) {

            if (money <= 0) {
                System.out.println("Out of money!");
                break;
            }

            switch (game) {
                case "OutFall 4":
                    if (money < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        money -= 39.99;
                        spent += 39.99;
                        System.out.println("Bought OutFall 4");
                    }
                    break;
                case "CS: OG":
                    if (money < 15.99) {
                        System.out.println("Too Expensive");
                    } else {
                        money -= 15.99;
                        spent += 15.99;
                        System.out.println("Bought CS: OG");
                    }
                    break;
                case "Zplinter Zell":
                    if (money < 19.99) {
                        System.out.println("Too Expensive");
                    } else {
                        money -= 19.99;
                        spent += 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }
                    break;
                case "Honored 2":
                    if (money < 59.99) {
                        System.out.println("Too Expensive");
                    } else {
                        money -= 59.99;
                        spent += 59.99;
                        System.out.println("Bought Honored 2");
                    }
                    break;
                case "RoverWatch":
                    if (money < 29.99) {
                        System.out.println("Too Expensive");
                    } else {
                        money -= 29.99;
                        spent += 29.99;
                        System.out.println("Bought RoverWatch");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (money < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        money -= 39.99;
                        spent += 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }
                    break;
                    default:
                        System.out.println("Not Found");
                        break;
            }
            game = scan.nextLine();
        }

        if (money > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, money);
        } else {
            System.out.println("Out of money!");
        }
    }
}
