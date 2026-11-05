class EmployeeSalary {
    private int id = 101;
    private String name = "Rahul";
    private double salary = 30000;

    public void setSalary(double s) {
        if (s >= 0 && s <= 1000000) {
            salary = s;
        } else {
            System.out.println("Invalid salary");
        }
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        EmployeeSalary e = new EmployeeSalary();

        e.setSalary(40000);
        e.display();

        e.setSalary(-500);
    }
}