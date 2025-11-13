import java.util.*;

public class MaxValueKey {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > maxValue) {
                maxValue = e.getValue();
                maxKey = e.getKey();
            }
        }

        System.out.println("Map: " + map);
        System.out.println("Key with Max Value: " + maxKey);
    }
}
