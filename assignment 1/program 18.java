
import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean prime = num > 1;

        for (int i = 2; i <= num / i && prime; i++) {
            if (num % i == 0)
                prime = false;
        }

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");

        sc.close();
    }
}
