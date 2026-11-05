public class PrimeChecker {
    static int totalPrimeChecks = 0;

    void check(int num) {
        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        totalPrimeChecks++;

        if (prime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
    }

    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();

        p.check(7);
        p.check(10);

        System.out.println("Total Checks: " + totalPrimeChecks);
    }
}