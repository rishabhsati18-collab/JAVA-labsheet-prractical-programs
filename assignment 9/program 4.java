import java.util.*;

class UniqueDepartments {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();

        departments.add("CSE");
        departments.add("BCA");
        departments.add("IT");
        departments.add("CSE");
        departments.add("BCA");

        System.out.println("Departments: " + departments);
    }
}