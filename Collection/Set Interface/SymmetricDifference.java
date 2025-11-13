import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));

        Set<Integer> result = new HashSet<>(s1);
        result.addAll(s2);
        Set<Integer> tmp = new HashSet<>(s1);
        tmp.retainAll(s2);
        result.removeAll(tmp);

        System.out.println(result);
    }
}
