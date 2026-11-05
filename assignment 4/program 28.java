public class WordCounter {
    static String language = "English";

    void count(String sentence) {
        String[] words = sentence.trim().split("\\s+");

        int total = words.length;

        System.out.println("Language: " + language);
        System.out.println("Sentence: " + sentence);
        System.out.println("Total Words: " + total);
    }

    public static void main(String[] args) {
        WordCounter w = new WordCounter();

        w.count("Java is an object oriented language");
    }
}