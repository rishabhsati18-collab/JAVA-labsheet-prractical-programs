
import java.util.Scanner;

public class Program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check power of 4 using shift operators
        int temp = num;

        while (temp > 1 && (temp & 3) == 0) {
            temp = temp >>> 2;
        }

        if (num > 0 && temp == 1)
            System.out.println("Power of 4");
        else
            System.out.println("Not a Power of 4");

        // Toggle the 3rd bit
        int result = num ^ (1 << 2);

        System.out.println("After toggling 3rd bit: " + result);

        // Multiplication table
        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 10; i++) {
            int value = result * i;

            if (value % 48 == 0)
                break;

            if (value % 6 == 0)
                continue;

            System.out.println(result + " x " + i + " = " + value);
        }

        sc.close();
    }
}
