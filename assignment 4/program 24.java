public class Fibonacci {
    static int seriesCount = 0;

    void display(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        seriesCount++;
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        f.display(10);

        System.out.println("\nTotal Series: " + seriesCount);
    }
}