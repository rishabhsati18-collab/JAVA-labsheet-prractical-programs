import java.util.*;

class CourseSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("HTML");

        System.out.print("Enter course name: ");
        String course = sc.nextLine();

        if (courses.contains(course)) {
            System.out.println("Course Found");
        } else {
            System.out.println("Course Not Found");
        }
    }
}