
public class Program19 {
    public static void main(String[] args) {

        System.out.println("Armstrong Numbers:");

        for (int num = 1; num <= 1000; num++) {
            int temp = num;
            int digits = 0;
            int sum = 0;

            int n = num;

            while (n > 0) {
                digits++;
                n /= 10;
            }

            n = num;

            while (n > 0) {
                int digit = n % 10;
                sum += (int) Math.pow(digit, digits);
                n /= 10;
            }

            if (sum == temp)
                System.out.print(num + " ");
        }
    }
}
