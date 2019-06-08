import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int tv = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double vp1 = p1 * h;
        double vp2 = p2 * h;
        double sum = vp1 + vp2;
        double vper = Math.floor((sum/tv) * 100);
        double p1per= Math.floor((vp1/sum) * 100);
        double p2per = Math.floor((vp2/sum) * 100);
        double ofl = sum - tv;
        if (sum <= tv) {
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.", vper, p1per, p2per );
        } else {
            System.out.printf("For %f hours the pool overflows with %f liters", h, ofl);
        }
    }
}
