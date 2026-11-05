public class Program24 {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 30, 20, 40};
        int[] result = new int[a.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (a[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result[count] = a[i];
                count++;
            }
        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
    }
}