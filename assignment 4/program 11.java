public class Calculator {
    static int operationsCount = 0;

    void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
        operationsCount++;
    }

    void subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
        operationsCount++;
    }

    void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
        operationsCount++;
    }

    void divide(int a, int b) {
        if (b != 0) {
            int result = a / b;
            System.out.println("Division: " + result);
            operationsCount++;
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(20, 10);
        c.subtract(20, 10);
        c.multiply(20, 10);
        c.divide(20, 10);

        System.out.println("Total Operations: " + operationsCount);
    }
}