
import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float number: ");
        float num = sc.nextFloat();

        int converted = (int) num;

        System.out.println("Original value: " + num);
        System.out.println("Converted value: " + converted);

        sc.close();
    }
}
