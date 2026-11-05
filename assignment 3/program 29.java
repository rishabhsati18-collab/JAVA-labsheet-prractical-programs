import java.util.Arrays;

public class Program29 {
    public static void main(String[] args) {
        int[][] a = {
            {30, 10, 20},
            {50, 40},
            {90, 70, 80, 60}
        };

        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a[i]);
        }

        System.out.println("Sorted jagged array:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}