import java.util.*;

class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Rohit");
        names.add("Priya");

        ListIterator<String> it = names.listIterator();

        while (it.hasNext()) {
            String name = it.next();

            if (name.equals("Rohit")) {
                it.set("Karan");
                it.add("Neha");
            }
        }

        System.out.println("Updated List: " + names);
    }
}