import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {
        Map<String, Integer> visits = new HashMap<>();
        String[] pages = {"home", "about", "products", "home", "products", "contact", "home", "home"};

        // Track visits
        for (String page : pages)
            visits.put(page, visits.getOrDefault(page, 0) + 1);

        // Sort by descending visit count
        System.out.println("Page Visits (descending):");
        visits.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        // Most visited page
        String mostVisited = Collections.max(visits.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nMost Visited Page: " + mostVisited);
    }
}
