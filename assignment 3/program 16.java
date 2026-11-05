public class Program16 {
    public static void main(String[] args) {
        int[][][] a = {
            {{1, -2}, {3, -4}},
            {{-5, 6}, {-7, 8}}
        };

        int positive = 0, negative = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (a[i][j][k] > 0) {
                        positive++;
                    } else if (a[i][j][k] < 0) {
                        negative++;
                    }
                }
            }
        }

        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
    }
}