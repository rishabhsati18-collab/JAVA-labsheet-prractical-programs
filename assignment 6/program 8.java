class NestedTry {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int arr[] = {10, 20, 30};

        try {
            try {
                System.out.println(arr[5]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index");
            }

            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}