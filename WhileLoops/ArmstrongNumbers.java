package WhileLoops;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());//It is the number to check armstrong
        int c = 0, a, temp;
        temp = n;

        while(n > 0) {
            a = n % 10;
            n = n / 10;
            c += (a * a * a);
        }
        if(temp == c) {
            System.out.println("armstrong number");
        } else {
            System.out.println("Not armstrong number");
        }
    }
}
