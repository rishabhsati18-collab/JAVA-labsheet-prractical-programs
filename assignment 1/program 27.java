
import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        if (sp > cp)
            System.out.println("Profit: " + (sp - cp));
        else if (cp > sp)
            System.out.println("Loss: " + (cp - sp));
        else
            System.out.println("No Profit No Loss");

        sc.close();
    }
}
