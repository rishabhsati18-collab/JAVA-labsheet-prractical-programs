interface Researcher {
    void doResearch();
}

class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    double calculateSalary() {
        return salary;
    }
}

class Teacher extends Employee implements Researcher {
    String subject = "Java";

    Teacher(int i, String n, double s) {
        super(i, n, s);
    }

    void teach() {
        System.out.println("Teaching " + subject);
    }

    public void doResearch() {
        System.out.println("Teacher is doing research");
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + 5000;
    }
}

class VisitingTeacher extends Teacher {
    int hoursWorked = 10;

    VisitingTeacher(int i, String n, double s) {
        super(i, n, s);
    }

    @Override
    double calculateSalary() {
        return hoursWorked * 500;
    }
}

class Admin extends Employee {
    Admin(int i, String n, double s) {
        super(i, n, s);
    }

    void manageDepartment() {
        System.out.println("Managing department");
    }
}

class UniversitySystem {
    public static void main(String[] args) {
        Teacher t = new Teacher(101, "Rahul", 30000);
        VisitingTeacher v = new VisitingTeacher(102, "Aman", 10000);
        Admin a = new Admin(103, "Ravi", 25000);

        t.displayDetails();
        t.teach();
        t.doResearch();
        System.out.println("Teacher Salary: " + t.calculateSalary());

        System.out.println();

        v.displayDetails();
        System.out.println("Visiting Teacher Salary: " + v.calculateSalary());

        System.out.println();

        a.displayDetails();
        a.manageDepartment();
    }
}