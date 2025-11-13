import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;

        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();

        for (int i = 0; i < n; i++) first.next();

        while (first.hasNext()) {
            first.next();
            second.next();
        }
        System.out.println("Nth from end: " + second.next());
    }
}
