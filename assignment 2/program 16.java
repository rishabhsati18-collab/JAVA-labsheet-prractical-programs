
import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter power of 2: ");
        int power = sc.nextInt();

        int multiply = num << power;
        int divide = num >> power;

        System.out.println("After multiplication: " + multiply);
        System.out.println("After division: " + divide);

        sc.close();
    }
}
