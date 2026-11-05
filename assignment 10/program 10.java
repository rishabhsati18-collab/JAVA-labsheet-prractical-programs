import java.io.*;
import java.util.*;

class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("employees.txt");

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            fw.write(id + "," + name + "," +
                     department + "," + salary);

            fw.close();

            System.out.print("\nEnter Employee ID to search: ");
            int searchID = sc.nextInt();

            File file = new File("employees.txt");

            if (file.exists()) {
                BufferedReader br =
                    new BufferedReader(new FileReader(file));

                String line;
                boolean found = false;

                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");

                    if (Integer.parseInt(data[0]) == searchID) {
                        System.out.println("\nEmployee Record Found");
                        System.out.println("Employee ID: " + data[0]);
                        System.out.println("Name: " + data[1]);
                        System.out.println("Department: " + data[2]);
                        System.out.println("Salary: " + data[3]);

                        found = true;
                        break;
                    }
                }

                br.close();

                if (!found) {
                    System.out.println("Employee record not found.");
                }
            } else {
                System.out.println("Employee file does not exist.");
            }
        }
        catch (IOException e) {
            System.out.println("File error.");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number.");
        }

        sc.close();
    }
}