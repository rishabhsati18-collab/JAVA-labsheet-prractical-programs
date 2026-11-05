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

class StudentDetails {
    public static void main(String[] args) {
        Student<Integer, String, Double> s1 =
            new Student<>(101, "Rahul", 85.5);

        Student<Integer, String, Double> s2 =
            new Student<>(102, "Aman", 90.0);

        Student<Integer, String, Double> s3 =
            new Student<>(103, "Ravi", 78.5);

        s1.display();
        s2.display();
        s3.display();
    }
}