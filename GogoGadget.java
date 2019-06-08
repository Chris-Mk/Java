public class GogoGadget {
    private static long calcSum(int ... elements) {
        long sum = 0;

        for (long element : elements) {
            sum += element;
        }
        return sum;
    }

    public static void main(String ... args) {
        long sum1 = calcSum(2, 5);
        System.out.println(sum1);

        long sum2 = calcSum(4, 0, -2, 12);
        System.out.println(sum2);

        long sum3 = calcSum();
        System.out.println(sum3);
    }
}
