import java.util.Scanner;

public class DailyProfit {
    public static void main(String []args){
        Scanner console = new Scanner(System.in);

        int dpm = Integer.parseInt(console.nextLine());
        double mpd = Double.parseDouble(console.nextLine());
        double rate = Double.parseDouble(console.nextLine());

        double mpm = dpm * mpd;
        double dpy = dpm * 12;
        double mpy = dpy * mpd;
        double Mpy = mpy + 2.5*mpm;
        double afterTax = Mpy - 0.25 * Mpy;
        double lev = afterTax * rate;
        double avg = lev / 365;
        System.out.printf("%.2f",avg);
    }
}
