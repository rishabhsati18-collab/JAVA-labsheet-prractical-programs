
import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int visitors = 0;

        System.out.print("Enter visitors entering: ");
        int entering = sc.nextInt();

        System.out.print("Enter visitors leaving: ");
        int leaving = sc.nextInt();

        for (int i = 0; i < entering; i++) {
            System.out.println("Entering: " + ++visitors);
        }

        for (int i = 0; i < leaving; i++) {
            System.out.println("Leaving: " + visitors--);
        }

        System.out.println("Remaining Visitors: " + visitors);
        sc.close();
    }
}
