public class Student {
    String name;
    int age;
    static int count = 0;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        count++;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Rahul";
        s1.age = 20;

        s2.name = "Aman";
        s2.age = 21;

        s1.display();
        s2.display();

        System.out.println("Total Students: " + count);
    }
}