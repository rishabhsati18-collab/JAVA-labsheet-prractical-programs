import java.util.*;

class ListComparison {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        LinkedList<String> l = new LinkedList<>();

        // Adding elements
        a.add("Java");
        a.add("Python");
        a.add("C++");

        l.add("Java");
        l.add("Python");
        l.add("C++");

        // Insertion
        a.add(1, "HTML");
        l.add(1, "HTML");

        // Deletion
        a.remove("Python");
        l.remove("Python");

        // Displaying
        System.out.println("ArrayList: " + a);
        System.out.println("LinkedList: " + l);

        System.out.println("ArrayList get: " + a.get(1));
        System.out.println("LinkedList get: " + l.get(1));

        System.out.println("ArrayList Size: " + a.size());
        System.out.println("LinkedList Size: " + l.size());

        System.out.println("ArrayList Iteration:");
        for (String s : a) {
            System.out.println(s);
        }

        System.out.println("LinkedList Iteration:");
        for (String s : l) {
            System.out.println(s);
        }
    }
}