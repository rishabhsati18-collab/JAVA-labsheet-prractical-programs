
import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (!password.equals("java123"))
                System.out.println("Incorrect password. Try again.");

        } while (!password.equals("java123"));

        System.out.println("Correct password! Access granted.");

        sc.close();
    }
}
