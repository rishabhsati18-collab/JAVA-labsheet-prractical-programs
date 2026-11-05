public class Laptop {
    String brand = "Dell";
    int RAM = 8;

    static String os = "Windows";

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("OS: " + os);
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.display();
    }
}