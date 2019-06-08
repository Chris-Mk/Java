import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double income = Double.parseDouble(console.nextLine());
        double avgSuccess = Double.parseDouble(console.nextLine());
        double minWage = Double.parseDouble(console.nextLine());

        double socialScholarship = 0;
        double excellentScholarship = 0;

        if (income < minWage && success > 4.5) {
            socialScholarship = Math.floor(minWage * .35);
        }

        if (success >= 5.5) {
            excellentScholarship = Math.floor(success * 25);
        }

        if (socialScholarship > excellentScholarship) {
            System.out.println("You get a Social scholarship %.2f BGN", socialScholarship);
        } else if (socialScholarship < excellentScholarship) {
            System.out.println("You get a scholarship for excellent results %.2f BGN", excellentScholarship);
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
