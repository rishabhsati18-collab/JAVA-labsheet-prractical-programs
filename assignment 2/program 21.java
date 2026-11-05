
import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Enter a positive number");
        } else {
            int i = 1;

            System.out.println("Factors:");

            do {
                if (num % i == 0)
                    System.out.print(i + " ");

                i++;
            } while (i <= num);
        }

        sc.close();
    }
}
