class Box<T> {
    T value;

    Box(T v) {
        value = v;
    }

    void display() {
        System.out.println(value);
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(100);
        Box<String> b2 = new Box<>("Hello");
        Box<Double> b3 = new Box<>(10.5);

        b1.display();
        b2.display();
        b3.display();
    }
}