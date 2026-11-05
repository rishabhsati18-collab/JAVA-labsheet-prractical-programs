public class Employee {
    int empId = 101;
    double salary = 25000;

    static String companyName = "ABC Company";

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}