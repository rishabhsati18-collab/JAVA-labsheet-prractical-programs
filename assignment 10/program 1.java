import java.io.*;

class StudentFile {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");
            FileWriter fw = new FileWriter(file);

            fw.write("Student Name: Aman\n");
            fw.write("Roll Number: 101\n");
            fw.write("Course: BCA\n");
            fw.write("Semester: 3");

            fw.close();

            System.out.println("File created and data written successfully.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}