import java.util.*;

class UpdateStudent {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Aman");
        students.add("Rohit");
        students.add("Priya");
        students.add("Neha");
        students.add("Rahul");

        students.set(1, "Karan");
        students.remove(3);

        System.out.println("Updated List: " + students);
    }
}