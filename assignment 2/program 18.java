
public class Program18 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
