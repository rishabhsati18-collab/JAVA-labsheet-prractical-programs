public class Employee {
    String name;
    double salary;

    static String organization = "ABC Company";

    void compare(Employee e1, Employee e2) {
        System.out.println("Organization: " + organization);

        if (e1.salary > e2.salary) {
            System.out.println(e1.name + " has higher salary");
        } else if (e2.salary > e1.salary) {
            System.out.println(e2.name + " has higher salary");
        } else {
            System.out.println("Both salaries are equal");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Rahul";
        e1.salary = 30000;

        e2.name = "Aman";
        e2.salary = 25000;

        e1.compare(e1, e2);
    }
}