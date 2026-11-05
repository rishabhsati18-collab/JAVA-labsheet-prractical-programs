public class Product {
    int id = 101;
    String name = "Laptop";
    double price = 50000;

    static double discountRate = 10;

    void calculate() {
        double discount = price * discountRate / 100;
        double finalPrice = price - discount;

        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.calculate();
    }
}