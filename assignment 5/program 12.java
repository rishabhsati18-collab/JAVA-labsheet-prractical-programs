class Employee {
    String name = "Aman";
    int id = 101;

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer writes Java code");
    }
}

class Manager extends Employee {
    void conductMeeting() {
        System.out.println("Manager conducts meeting");
    }
}

class EmployeeRoles {
    public static void main(String[] args) {
        Developer d = new Developer();
        Manager m = new Manager();

        d.displayEmployee();
        d.writeCode();

        m.displayEmployee();
        m.conductMeeting();
    }
}