class Student<T> {
    T id;

    Student(T i) {
        id = i;
    }

    void display() {
        System.out.println("Student ID: " + id);
    }
}

class StudentID {
    public static void main(String[] args) {
        Student<Integer> s = new Student<>(101);
        s.display();
    }
}