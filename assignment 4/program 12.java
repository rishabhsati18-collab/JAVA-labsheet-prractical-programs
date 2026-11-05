public class StudentMarks {
    int marks1 = 80;
    int marks2 = 75;
    int marks3 = 85;

    static String universityName = "COER University";

    void calculate() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("University: " + universityName);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        StudentMarks s = new StudentMarks();
        s.calculate();
    }
}