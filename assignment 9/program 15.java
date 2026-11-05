import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        HashSet<Integer> uniqueIDs = new HashSet<>();
        TreeSet<Integer> sortedIDs = new TreeSet<>();

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Count Students");
            System.out.println("6. Forward and Backward");
            System.out.println("7. Display Sorted IDs");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    if (uniqueIDs.contains(id)) {
                        System.out.println("ID already exists!");
                    } else {
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        students.add(new Student(id, name));
                        uniqueIDs.add(id);
                        sortedIDs.add(id);

                        System.out.println("Student Added");
                    }
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    int removeID = sc.nextInt();

                    boolean removed = false;

                    Iterator<Student> it = students.iterator();

                    while (it.hasNext()) {
                        Student s = it.next();

                        if (s.id == removeID) {
                            it.remove();
                            uniqueIDs.remove(removeID);
                            sortedIDs.remove(removeID);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Student Removed");
                    } else {
                        System.out.println("Student Not Found");
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchID = sc.nextInt();

                    if (uniqueIDs.contains(searchID)) {
                        System.out.println("Student Found");
                    } else {
                        System.out.println("Student Not Found");
                    }
                    break;

                case 4:
                    System.out.println("Student Records:");

                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;

                case 5:
                    System.out.println("Total Students: " +
                                       students.size());
                    break;

                case 6:
                    ListIterator<Student> list =
                            students.listIterator();

                    System.out.println("Forward:");

                    while (list.hasNext()) {
                        System.out.println(list.next());
                    }

                    System.out.println("Backward:");

                    while (list.hasPrevious()) {
                        System.out.println(list.previous());
                    }
                    break;

                case 7:
                    System.out.println("Unique IDs: " + uniqueIDs);
                    System.out.println("Sorted IDs: " + sortedIDs);
                    break;

                case 0:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        sc.close();
    }
}