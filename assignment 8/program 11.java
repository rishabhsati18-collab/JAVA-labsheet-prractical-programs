import java.util.ArrayList;
import java.util.Scanner;

class SearchList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.print("Enter number to search: ");
        int n = sc.nextInt();

        if (list.contains(n)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}