public class Program15 {
    public static void main(String[] args) {
        int[][][] a = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };

        int sum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    sum += a[i][j][k];
                }
            }
        }

        System.out.println("Sum = " + sum);
    }
}