package WhileLoops;

import java.util.Scanner;

public class OwnBusiness {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();
        int totalComputers = 0;
        int volume = width * length * height;

        while (!command.equals("Done")) {
            int computers = Integer.parseInt(command);
            totalComputers += computers;

           if (volume < totalComputers) {
               break;
           }
           command = scan.nextLine();
        }
        if (volume > totalComputers) {
            System.out.printf("%d Cubic meters left.", volume - totalComputers);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", totalComputers - volume);
        }
    }
}
