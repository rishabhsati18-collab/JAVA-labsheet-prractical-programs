
import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long n = Math.abs((long) num);
        int count = 0;

        if (n == 0)
            count = 1;
        else {
            while (n > 0) {
                count++;
                n = n / 10;
            }
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
