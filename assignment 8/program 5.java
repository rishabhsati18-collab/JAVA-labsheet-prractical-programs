class Product<T, U> {
    T id;
    U price;

    Product(T i, U p) {
        id = i;
        price = p;
    }

    void display() {
        System.out.println("Product ID: " + id + " Price: " + price);
    }
}

class ProductDemo {
    public static void main(String[] args) {
        Product<Integer, Double> p1 = new Product<>(1, 100.0);
        Product<Integer, Double> p2 = new Product<>(2, 250.5);
        Product<Integer, Double> p3 = new Product<>(3, 500.0);

        p1.display();
        p2.display();
        p3.display();
    }
}