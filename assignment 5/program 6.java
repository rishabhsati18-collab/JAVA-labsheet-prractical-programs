class Employee {
    private String name = "Rahul";
    private double salary = 30000;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String department = "IT";

    public static void main(String[] args) {
        Manager m = new Manager();

        System.out.println("Name: " + m.getName());
        System.out.println("Salary: " + m.getSalary());
        System.out.println("Department: " + m.department);
    }
}