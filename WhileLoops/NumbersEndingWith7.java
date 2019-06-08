public class NumbersEndingWith7 {

    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 1000) {

            if (counter % 10 == 7) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
