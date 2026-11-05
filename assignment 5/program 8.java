class Person {
    void displayName() {
        System.out.println("Name: Rahul");
    }
}

class Employee extends Person {
    void displayEmployee() {
        System.out.println("Employee ID: 101");
    }
}

class ManagerHierarchy extends Employee {
    void displayManager() {
        System.out.println("Department: IT");
    }

    public static void main(String[] args) {
        ManagerHierarchy m = new ManagerHierarchy();

        m.displayName();
        m.displayEmployee();
        m.displayManager();
    }
}