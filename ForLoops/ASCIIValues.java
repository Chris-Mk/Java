public class ASCIIValues {
    public static void main(String[] args) {

        System.out.println("Small Letters:");
        for (char smallLetter = 'a'; smallLetter <= 'z'; smallLetter++) {
            System.out.printf("%c \t %d%n", smallLetter, (int) smallLetter);
        }
        System.out.println();

        System.out.println("Capital Letters:");
        for (char capitalLetters = 'A'; capitalLetters <= 'Z'; capitalLetters++) {
            System.out.printf("%c \t %d%n", capitalLetters, (int) capitalLetters);
        }
        System.out.println();

        System.out.println("Numbers:");
        for (char i = '0'; i <= '9'; i++) {
            System.out.printf("%c \t %d%n", i , (int) i);
        }
    }
}
