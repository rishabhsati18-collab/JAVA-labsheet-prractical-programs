import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    InvalidExamMarksException(String msg) {
        super(msg);
    }
}

class ExamSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = Integer.parseInt(sc.nextLine());

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException("Invalid marks");
            }

            if (marks >= 40) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Enter a valid number");
        }
        catch (InvalidExamMarksException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Exam evaluation completed.");
        }
    }
}