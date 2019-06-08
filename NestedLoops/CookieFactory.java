import java.util.Scanner;

public class CookieFactory {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfBatch = Integer.parseInt(scan.nextLine());
        boolean flour = false;
        boolean sugar = false;
        boolean eggs = false;

        for (int i = 1; i <= numOfBatch; i++) {
            while (true) {
                String ingredients = scan.nextLine();

                switch (ingredients) {
                    case "flour":
                        flour = true;
                        break;
                    case "eggs":
                        eggs = true;
                        break;
                    case "sugar":
                        sugar = true;
                        break;
                }

                if (ingredients.equals("Bake!")) {
                    if (flour && sugar && eggs) {
                        System.out.printf("Baking batch number %d...%n", i);

                        flour = false;
                        sugar = false;
                        eggs = false;
                        break;
                    } else {
                        System.out.println("The batter should contain flour, eggs and sugar!");
                    }
                }
            }
        }
    }
}
