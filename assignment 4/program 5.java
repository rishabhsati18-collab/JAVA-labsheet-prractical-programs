public class Book {
    String title = "Java Programming";
    String author = "James Gosling";
    int price = 450;

    static String publisher = "ABC Publications";

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisher);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.display();
    }
}