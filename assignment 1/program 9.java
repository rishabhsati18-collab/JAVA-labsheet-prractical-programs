
import java.util.Scanner;

public class Program09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of three subjects: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a + b + c;
        double percentage = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (a >= 40 && b >= 40 && c >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");

        sc.close();
    }
}
