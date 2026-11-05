public class Library {
    int booksAvailable = 50;

    static String libraryName = "Central Library";

    void issueBook() {
        int quantity = 5;

        if (quantity <= booksAvailable) {
            booksAvailable = booksAvailable - quantity;
            System.out.println("Books Issued: " + quantity);
        } else {
            System.out.println("Books Not Available");
        }
    }

    void returnBook() {
        int quantity = 2;

        booksAvailable = booksAvailable + quantity;
        System.out.println("Books Returned: " + quantity);
    }

    public static void main(String[] args) {
        Library l = new Library();

        System.out.println("Library: " + libraryName);

        l.issueBook();
        System.out.println("Available Books: " + l.booksAvailable);

        l.returnBook();
        System.out.println("Available Books: " + l.booksAvailable);
    }
}