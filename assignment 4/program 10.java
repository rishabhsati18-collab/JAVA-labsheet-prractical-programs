public class Movie {
    String name = "3 Idiots";
    String genre = "Comedy";
    double rating = 8.4;

    static String industry = "Bollywood";

    void display() {
        System.out.println("Movie: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Industry: " + industry);
    }

    public static void main(String[] args) {
        Movie m = new Movie();
        m.display();
    }
}