package LuckyNumbers;

public class LuckyNumberOG {
    public static void main(String[] args) {

//prints 4 digits number those sum in each pair are equal
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        if ((i + j) == (k + l)) {
                            System.out.printf("%d%d%d%d%n", i, j, k ,l);
                        }
                    }
                }
            }
        }
    }
}
