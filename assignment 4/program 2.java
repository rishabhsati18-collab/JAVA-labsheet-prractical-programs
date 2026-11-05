public class Rectangle {
    int length = 10;
    int breadth = 5;

    static String shapeName = "Rectangle";

    void area() {
        int result = length * breadth;
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + result);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}