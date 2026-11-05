class Person {
    String name = "Rahul";

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher is teaching");
    }
}

class PersonRoles {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        s.displayName();
        s.study();

        t.displayName();
        t.teach();
    }
}