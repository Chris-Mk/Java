import java.util.Scanner;
public class Travelling {
    public static void main(String[] args){
        Scanner Scan_Travelling = new Scanner(System.in);

        while (true) {
            String country = Scan_Travelling.nextLine();
            if (country.equals("End")) {
                break;
            }

            double budget = Double.parseDouble(Scan_Travelling.nextLine());
            double total = 0;
            while(budget > total){
                double money = Double.parseDouble(Scan_Travelling.nextLine());
                total += money;
            }
            System.out.printf("Going to %s! %n", country);
        }
    }
}