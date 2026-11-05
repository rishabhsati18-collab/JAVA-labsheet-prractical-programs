public class Program17 {
    public static void main(String[] args) {
        int[][][] a = {
            {{10, 20}, {30, 40}},
            {{50, 60}, {70, 80}}
        };

        int max = a[0][0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (a[i][j][k] > max) {
                        max = a[i][j][k];
                    }
                }
            }
        }

        System.out.println("Maximum = " + max);
    }
}