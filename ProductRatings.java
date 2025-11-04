import java.util.*;
import java.util.stream.Collectors;

public class ProductRatings {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3};
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, null, 4));

        ArrayList<Integer> allRatings = new ArrayList<>();
        for (int r : oldRatings) allRatings.add(r);
        allRatings.addAll(newRatings);

        List<Integer> validRatings = allRatings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        double avg = validRatings.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);

        System.out.println("Average Rating: " + avg);
    }
}
