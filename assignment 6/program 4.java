class MultipleCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int arr[] = {10, 20, 30, 40, 50};

        try {
            System.out.println("Division: " + (a / b));
            System.out.println("Array: " + arr[7]);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}