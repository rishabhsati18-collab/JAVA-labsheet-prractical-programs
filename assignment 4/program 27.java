public class StringReverse {
    static int totalReversals = 0;

    void reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }

        totalReversals++;

        System.out.println("Original: " + str);
        System.out.println("Reverse: " + result);
    }

    public static void main(String[] args) {
        StringReverse s = new StringReverse();

        s.reverse("Java");
        s.reverse("Hello");

        System.out.println("Total Reversals: " + totalReversals);
    }
}