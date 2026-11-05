public class Program23 {
    public static void main(String[] args) {
        int[] a = {10, 50, 30, 40, 20};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : a) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest does not exist");
        } else {
            System.out.println("Second largest = " + second);
        }
    }
}