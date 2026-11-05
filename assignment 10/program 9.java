import java.io.*;
import java.util.*;

class StudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("student_records.txt");

            for (int i = 1; i <= 5; i++) {
                System.out.println("\nEnter Student " + i + " Details");

                System.out.print("Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Course: ");
                String course = sc.nextLine();

                System.out.print("Marks: ");
                int marks = sc.nextInt();
                sc.nextLine();

                fw.write("Roll Number: " + roll + "\n");
                fw.write("Name: " + name + "\n");
                fw.write("Course: " + course + "\n");
                fw.write("Marks: " + marks + "\n\n");
            }

            fw.close();

            BufferedReader br =
                new BufferedReader(new FileReader("student_records.txt"));

            String line;

            System.out.println("\nAll Student Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch (IOException e) {
            System.out.println("File error.");
        }

        sc.close();
    }
}