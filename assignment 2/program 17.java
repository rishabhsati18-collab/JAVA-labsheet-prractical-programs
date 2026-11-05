
import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int result = (num << 2) | (num >>> 30);

        System.out.println("After left rotation by 2: " + result);

        sc.close();
    }
}
