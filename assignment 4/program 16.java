public class Triangle {
    int a = 5, b = 5, c = 5;

    static String type = "Triangle";

    void check() {
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");

            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Invalid Triangle");
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.check();
    }
}