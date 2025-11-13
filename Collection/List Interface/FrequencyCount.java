import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> freq = new HashMap<>();
        for (String item : items) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }
        System.out.println(freq);
    }
}
