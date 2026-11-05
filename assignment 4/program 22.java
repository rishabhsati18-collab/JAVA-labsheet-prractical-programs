public class Armstrong {
    static int totalChecks = 0;

    void check(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }

        totalChecks++;

        if (sum == original) {
            System.out.println(original + " is Armstrong");
        } else {
            System.out.println(original + " is not Armstrong");
        }
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();

        a.check(153);
        a.check(123);

        System.out.println("Total Checks: " + totalChecks);
    }
}