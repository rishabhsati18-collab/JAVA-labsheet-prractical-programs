import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] a = {
            {{10, 20}, {30, 40}},
            {{50, 60}, {70, 80}}
        };

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (a[i][j][k] == search) {
                        System.out.println("Found at position: "
                            + (i + 1) + ", " + (j + 1) + ", " + (k + 1));
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}