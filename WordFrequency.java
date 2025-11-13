import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful!";
        sentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = sentence.split(" ");
        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency:");
        freq.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
