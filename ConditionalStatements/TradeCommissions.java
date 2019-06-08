import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String city = in.nextLine().toLowerCase();
        double sales = Double.parseDouble(in.nextLine());
        double commission = -1;

        if (city.equals("sofia")) {
            if (sales >= 0 && sales <= 500) {
                commission = sales * .05;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * .07;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * .08;
            } else if (sales > 10000) {
                commission = sales * .12;
            }
        } else if (city.equals("varna")) {
            if (sales >= 0 && sales <= 500) {
                commission = sales * .045;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * .075;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * .10;
            } else if (sales > 10000) {
                commission = sales * .13;
            }
        } else if (city.equals("plovdiv")){
            if (sales >= 0 && sales <= 500) {
                commission = sales * .055;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * .08;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * .12;
            } else if (sales > 10000) {
                commission = sales * .145;
            }
        }

        if (commission >= 0) {
            System.out.printf("%.2f", commission);
        }else {
            System.out.println("error");
        }
    }
}