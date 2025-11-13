import java.util.*;

class Movie {
    String title, genre;
    Movie(String title, String genre) {
        this.title = title; this.genre = genre;
    }
    public String toString() { return title + " (" + genre + ")"; }
}

public class StreamingApp {
    public static void main(String[] args) {
        List<Movie> all = List.of(
            new Movie("Inception", "Sci-Fi"),
            new Movie("Avengers", "Action"),
            new Movie("Titanic", "Romance")
        );

        Queue<Movie> upNext = new LinkedList<>();
        Stack<Movie> history = new Stack<>();
        Set<String> genres = new HashSet<>();

        upNext.add(all.get(0));
        upNext.add(all.get(1));

        while (!upNext.isEmpty()) {
            Movie m = upNext.poll();
            System.out.println("Now Watching: " + m);
            history.push(m);
            genres.add(m.genre);
        }

        System.out.println("Watched Genres: " + genres);
        System.out.println("Recommendations: " + all.stream()
                .filter(m -> genres.contains(m.genre))
                .toList());
    }
}
