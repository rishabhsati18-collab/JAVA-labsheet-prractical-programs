import java.io.*;

class CharacterCount {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("input.txt");
            fw.write("Java 123");
            fw.close();

            FileReader fr = new FileReader("input.txt");

            int ch;
            int vowels = 0;
            int consonants = 0;
            int digits = 0;
            int spaces = 0;

            while ((ch = fr.read()) != -1) {
                char c = (char) ch;

                if (c == ' ') {
                    spaces++;
                }
                else if (Character.isDigit(c)) {
                    digits++;
                }
                else if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);

                    if (c == 'a' || c == 'e' ||
                        c == 'i' || c == 'o' || c == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            fr.close();

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);
        }
        catch (IOException e) {
            System.out.println("File error.");
        }
    }
}