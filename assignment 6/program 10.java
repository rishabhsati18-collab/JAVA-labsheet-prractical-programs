import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

class InvalidMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Invalid marks");
            }

            System.out.println("Valid marks");
        }
        catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}