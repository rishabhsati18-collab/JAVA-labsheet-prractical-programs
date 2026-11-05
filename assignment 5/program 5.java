class Person {
    String name = "Aman";
    int age = 20;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class CollegeStudent extends Person {
    int rollNo = 101;
    String course = "BCA";

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        CollegeStudent s = new CollegeStudent();

        s.displayPerson();
        s.displayStudent();
    }
}  