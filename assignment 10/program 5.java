import java.io.*;

class CopyFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("source.txt");
            fw.write("Welcome to Java File Handling.");
            fw.close();

            FileReader fr = new FileReader("source.txt");
            FileWriter copy = new FileWriter("backup.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                copy.write(ch);
            }

            fr.close();
            copy.close();

            System.out.println("File copied successfully.");
        }
        catch (IOException e) {
            System.out.println("File error.");
        }
    }
}