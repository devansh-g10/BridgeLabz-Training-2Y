import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        // 1. Add country-capital pairs
        countries.put("India", "New Delhi");
        countries.put("USA", "Washington D.C.");
        countries.put("Japan", "Tokyo");
        countries.put("Germany", "Berlin");
        countries.put("France", "Paris");
        countries.put("China", "Beijing");
        countries.put("Russia", "Moscow");
        countries.put("Brazil", "Brasilia");

        // 2. User lookup
        String input = "India";
        if (countries.containsKey(input))
            System.out.println("Capital of " + input + " is " + countries.get(input));
        else
            System.out.println("Unknown country");

        // 3. Print all sorted alphabetically
        System.out.println("\nAll Countries & Capitals:");
        countries.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }
}
