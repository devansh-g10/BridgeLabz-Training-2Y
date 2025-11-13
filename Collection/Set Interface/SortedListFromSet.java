import java.util.*;

public class SortedListFromSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);
        System.out.println(sorted);
    }
}
