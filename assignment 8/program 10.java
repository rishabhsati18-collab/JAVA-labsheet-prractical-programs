import java.util.ArrayList;

class StringList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Aman");
        names.add("Ravi");
        names.add("Rohit");
        names.add("Karan");

        System.out.println("Names: " + names);

        System.out.println("First name: " + names.get(0));

        names.set(1, "Arjun");
        System.out.println("After set: " + names);

        names.remove("Ravi");
        System.out.println("After remove: " + names);

        System.out.println("Size: " + names.size());
    }
}