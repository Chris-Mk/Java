import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double presentMoney = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double lightsabersPrice = Double.parseDouble(scan.nextLine());
        double robesPrice = Double.parseDouble(scan.nextLine());
        double beltsPrice = Double.parseDouble(scan.nextLine());

        double cost = ((lightsabersPrice * students) + Math.ceil(students * .10) * lightsabersPrice) +
                (robesPrice * students) + ((students - (students / 6)) * beltsPrice);

        if (cost <= presentMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", cost);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", cost - presentMoney);
        }
    }
}
