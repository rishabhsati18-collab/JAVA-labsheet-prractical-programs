public class Program30 {
    public static void main(String[] args) {
        int[][] a = {
            {0, 0, 3},
            {0, 0, 0},
            {5, 0, 0}
        };

        int zero = 0, nonZero = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 0) {
                    zero++;
                } else {
                    nonZero++;
                }
            }
        }

        System.out.println("Zero elements = " + zero);
        System.out.println("Non-zero elements = " + nonZero);

        if (zero > nonZero) {
            System.out.println("It is a Sparse Matrix");
        } else {
            System.out.println("It is not a Sparse Matrix");
        }
    }
}