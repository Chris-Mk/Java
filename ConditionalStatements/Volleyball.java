import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String year = scan.nextLine().toLowerCase();
        int holidays = Integer.parseInt(scan.nextLine());
        int weekendsHome = Integer.parseInt(scan.nextLine());

        double weekendsSofia = 48 - weekendsHome;
        double playSofia = (3.0/4 * weekendsSofia) + (2.0/3 * holidays);
        double playTotal = playSofia + weekendsHome;

        if (year.equals("leap")) {
            playTotal = Math.floor(playTotal + (.15 * playTotal));
            System.out.printf("%.0f", playTotal);
        } else if (year.equals("normal")) {
            System.out.printf("%.0f", Math.floor(playTotal));
        }
    }
}
