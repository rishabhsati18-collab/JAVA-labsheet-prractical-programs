public class Pen {
    String color = "Blue";
    String type = "Ball Pen";

    static String manufacturer = "Parker";

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Manufacturer: " + manufacturer);
    }

    public static void main(String[] args) {
        Pen p = new Pen();
        p.display();
    }
}