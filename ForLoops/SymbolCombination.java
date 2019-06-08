package ForLoops;

import java.util.Scanner;

public class SymbolCombination {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int digitsSum = 0, capitalLetters = 0, smallLetter = 0, others = 0;
        StringBuffer biggestCombo = new StringBuffer();
        StringBuffer digits = new StringBuffer();
        StringBuffer cl = new StringBuffer();
        StringBuffer sl = new StringBuffer();
        StringBuffer ot = new StringBuffer();
        int biggestSum = 0;

        for (int i = 0; i < n; i++) {
            char symbol = scan.next().charAt(0);

            if (symbol >= 48 && symbol <= 57) {
                digitsSum += symbol;
                digits.append(symbol);
            } else if (symbol >= 65 && symbol <= 90) {
                capitalLetters += symbol;
                cl.append(symbol);
            } else if (symbol >= 97 && symbol <= 122) {
                smallLetter += symbol;
                sl.append(symbol);
            } else if ((symbol >= 32 && symbol <= 47)
                    || (symbol >= 58 && symbol <= 64)
                    || (symbol >= 91 && symbol <= 96)
                    || (symbol >= 123 && symbol <= 126)) {
                others += symbol;
                ot.append(symbol);
            }
        }

        if (digitsSum > capitalLetters && digitsSum > smallLetter && digitsSum > others) {
            biggestSum = digitsSum;
            biggestCombo = digits;

        } else if (capitalLetters > digitsSum && capitalLetters > smallLetter && capitalLetters > others) {
            biggestSum = capitalLetters;
            biggestCombo = cl;

        } else if (smallLetter > digitsSum && smallLetter > capitalLetters && smallLetter > others) {
            biggestSum = smallLetter;
            biggestCombo = sl;

        } else if (others > digitsSum && others > capitalLetters && others > smallLetter) {
            biggestSum = others;
            biggestCombo = ot;

        } else if (digitsSum == capitalLetters || digitsSum == smallLetter || digitsSum == others) {
            biggestSum = digitsSum;
            biggestCombo = digits;

        } else if (capitalLetters == smallLetter || capitalLetters == others) {
            biggestSum = capitalLetters;
            biggestCombo = cl;

        } else if (smallLetter == others) {
            biggestSum = smallLetter;
            biggestCombo = sl;
        }

        System.out.println("Biggest ASCII sum is: " + biggestSum);
        System.out.println("Combination of characters is: " + biggestCombo);
    }
}
