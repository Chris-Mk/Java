import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        String ageGroup = "";

        if (age <= 2) {
            ageGroup = "baby";
        } else if (age <= 13) {
            ageGroup ="child";
        } else if (age <= 19) {
            ageGroup = "teenager";
        } else if (age <= 65) {
            ageGroup = "adult";
        } else {
            ageGroup = "elder";
        }

        System.out.println(ageGroup);
    }
}
