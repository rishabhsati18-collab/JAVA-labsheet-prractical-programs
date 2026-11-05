
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory marks: ");
        double theory = sc.nextDouble();

        System.out.print("Enter practical marks: ");
        double practical = sc.nextDouble();

        System.out.print("Enter overall percentage: ");
        double overall = sc.nextDouble();

        if ((theory >= 40 && practical >= 50) || overall >= 50)
            System.out.println("Student Passed");
        else
            System.out.println("Student Failed");

        sc.close();
    }
}
