import java.util.Scanner;

class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index: ");
            int i = sc.nextInt();

            System.out.println("Element: " + arr[i]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
}