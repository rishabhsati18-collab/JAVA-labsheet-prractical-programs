import java.util.ArrayList;

class ListDisplay {
    static <T> void display(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Aman");

        System.out.println("Numbers:");
        display(numbers);

        System.out.println("Names:");
        display(names);
    }
}