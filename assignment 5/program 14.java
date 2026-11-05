class Employee {
    double calculateSalary() {
        return 20000;
    }
}

class Manager extends Employee {
    @Override
    double calculateSalary() {
        return 40000;
    }
}

class SalaryDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Employee Salary: " + e.calculateSalary());
        System.out.println("Manager Salary: " + m.calculateSalary());
    }
}