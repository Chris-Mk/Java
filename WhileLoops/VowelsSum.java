import java.util.Scanner;

public class VowelsSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");
        String input = scan.nextLine();
        int sum = 0;

        int counter = 0;
        while (counter < input.length()) {

            if (input.charAt(counter) == 'a') {
                sum += 1;
            } else if (input.charAt(counter) == 'e') {
                sum += 2;
            }  else if (input.charAt(counter) == 'i') {
                sum += 3;
            }  else if (input.charAt(counter) == 'o') {
                sum += 4;
            }  else if (input.charAt(counter) == 'u') {
                sum += 5;
            }
            counter++;
        }
        System.out.println("Vowels sum = " + sum);
    }
}
