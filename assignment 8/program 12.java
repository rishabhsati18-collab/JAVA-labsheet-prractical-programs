class Container<T> {
    T value;

    void add(T v) {
        value = v;
    }

    T get() {
        return value;
    }
}

class ContainerDemo {
    public static void main(String[] args) {
        Container<Integer> c1 = new Container<>();
        Container<String> c2 = new Container<>();
        Container<Double> c3 = new Container<>();

        c1.add(100);
        c2.add("Java");
        c3.add(10.5);

        System.out.println(c1.get());
        System.out.println(c2.get());
        System.out.println(c3.get());
    }
}