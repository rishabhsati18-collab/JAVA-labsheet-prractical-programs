public class StudentGrade {
    String name = "Aman";
    int marks = 85;

    static int passingMarks = 40;

    void calculateGrade() {
        int m = marks;

        System.out.println("Name: " + name);

        if (m >= 90) {
            System.out.println("Grade: A");
        } else if (m >= 75) {
            System.out.println("Grade: B");
        } else if (m >= 60) {
            System.out.println("Grade: C");
        } else if (m >= passingMarks) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        StudentGrade s = new StudentGrade();
        s.calculateGrade();
    }
}