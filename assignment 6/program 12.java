import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String msg) {
        super(msg);
    }
}

class PatientAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException("Invalid patient age");
            }

            System.out.println("Name: " + name);
            System.out.println("Registration successful");
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
        }
        catch (InvalidPatientAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}