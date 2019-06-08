import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char ch1 = scan.nextLine().charAt(0);
        char ch2 = scan.nextLine().charAt(0);

        int start = Math.min(ch1, ch2);
        int end = Math.max(ch1, ch2);

        for (int i = start + 1; i < end; i++) {
            System.out.print((char) i + " ");
        }
        //System.out.println(rangeCharacters(ch1, ch2));
    }

//    static String rangeCharacters(char ch1, char ch2) {
//        String output = "";
//
//        if (ch2 > ch1) {
//            for (int i = ch1; i < ch2 - 1; i++) {
//                output += ++ch1 + " ";
//            }
//        } else {
//            for (int i = ch2; i < ch1 - 1; i++) {
//                output += ++ch2 + " ";
//            }
//        }
//        return output;
//    }
}
