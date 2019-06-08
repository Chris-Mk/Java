import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int period = Integer.parseInt(scan.nextLine());
        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;

        for (int day = 1; day <= period; day++) {
            int patients = Integer.parseInt(scan.nextLine());

            if (day % 3 == 0) {
                if (treatedPatients < untreatedPatients) {
                    doctors++;
                }
            }

            if (patients <= doctors) {
                treatedPatients += patients;
            } else {
                treatedPatients += doctors;
                untreatedPatients += patients - doctors;
            }
        }
        System.out.println("Treated patients: " + treatedPatients + ".");
        System.out.println("Untreated patients: " + untreatedPatients + ".");
    }
}