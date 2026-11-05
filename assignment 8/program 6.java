class Employee<T, U> {
    T id;
    U name;

    Employee(T i, U n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Employee<Integer, String> e = new Employee<>(101, "Aman");
        e.display();
    }
}