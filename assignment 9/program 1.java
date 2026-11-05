import java.util.*;

class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Aman");
        students.add("Rohit");
        students.add("Priya");
        students.add("Neha");
        students.add("Rahul");
        students.add("Anjali");
        students.add("Karan");
        students.add("Simran");
        students.add("Vikas");
        students.add("Pooja");

        System.out.println("Student Names: " + students);
        System.out.println("Total Students: " + students.size());
    }
}