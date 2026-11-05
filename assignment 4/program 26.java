public class Matrix {
    int[][] a = {{1, 2}, {3, 4}};

    static String matrixType = "2x2 Matrix";

    void calculate() {
        int[][] b = {{5, 6}, {7, 8}};

        System.out.println("Addition:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }

        System.out.println("Subtraction:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((a[i][j] - b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();

        System.out.println(matrixType);
        m.calculate();
    }
}