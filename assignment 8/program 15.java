import java.util.ArrayList;

class Student<T, U, V> {
    T id;
    U name;
    V marks;

    Student(T i, U n, V m) {
        id = i;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student<Integer, String, Integer>> list =
            new ArrayList<>();

        Student<Integer, String, Integer> s1 =
            new Student<>(101, "Rahul", 85);

        Student<Integer, String, Integer> s2 =
            new Student<>(102, "Aman", 90);

        Student<Integer, String, Integer> s3 =
            new Student<>(103, "Ravi", 75);

        Student<Integer, String, Integer> s4 =
            new Student<>(104, "Rohit", 80);

        Student<Integer, String, Integer> s5 =
            new Student<>(105, "Karan", 95);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println("All Students:");

        for (Student<Integer, String, Integer> s : list) {
            s.display();
        }

        System.out.println("First Student:");
        list.get(0).display();

        int searchId = 103;
        boolean found = false;

        for (Student<Integer, String, Integer> s : list) {
            if (s.id.equals(searchId)) {
                System.out.println("Student Found:");
                s.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }

        System.out.println("Total Students: " + list.size());

        System.out.println("Type Safety: Integer ID, String Name, Integer Marks");
    }
}