import java.util.*;

class StudentQueue {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.addFirst("Aman");
        students.addLast("Rohit");
        students.addLast("Priya");
        students.addFirst("Neha");

        System.out.println("Queue: " + students);

        students.removeFirst();
        students.removeLast();

        System.out.println("After Removal: " + students);
    }
}