
import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num > 0 && num % i == 0)
                sum = sum + i;
        }

        if (num > 0 && sum == num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");

        sc.close();
    }
}
