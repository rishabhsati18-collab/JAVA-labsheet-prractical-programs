class GenericMethod {
    static <T> void display(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        display(10);
        display(10.5);
        display("Hello");
        display('A');
    }
}