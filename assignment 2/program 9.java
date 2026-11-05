
import java.util.Scanner;

public class Program09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int i = 0;
        int result = 0;

        while (i < s1.length() && i < s2.length()) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if (a < b) {
                result = -1;
                break;
            } else if (a > b) {
                result = 1;
                break;
            }
            i++;
        }

        if (result == 0) {
            if (s1.length() < s2.length())
                result = -1;
            else if (s1.length() > s2.length())
                result = 1;
        }

        if (result < 0)
            System.out.println("First string comes before second");
        else if (result > 0)
            System.out.println("First string comes after second");
        else
            System.out.println("Both strings are equal");

        sc.close();
    }
}
