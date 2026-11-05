import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == search) {
                    System.out.println("Found at row " + (i + 1)
                        + " and column " + (j + 1));
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}