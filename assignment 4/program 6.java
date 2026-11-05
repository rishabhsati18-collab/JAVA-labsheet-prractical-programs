public class Car {
    String brand = "Toyota";
    double mileage = 18.5;

    static int wheels = 4;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Mileage: " + mileage);
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}