public class Factorial {
    static int totalCalls = 0;

    void calculate(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        totalCalls++;

        System.out.println("Factorial: " + fact);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();

        f.calculate(5);
        f.calculate(4);

        System.out.println("Total Calls: " + totalCalls);
    }
}