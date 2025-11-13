import java.util.*;

public class FeedbackSystem {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        Set<String> unique = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        Stack<String> recent = new Stack<>();

        String[] feedbacks = {
            "Good service", "Fast delivery", "Good service", "Nice support"
        };

        for (String f : feedbacks) {
            if (unique.add(f)) {
                all.add(f);
                queue.add(f);
            }
        }

        while (!queue.isEmpty()) {
            String msg = queue.poll();
            System.out.println("Processing: " + msg);
            recent.push(msg);
        }

        System.out.println("Recent Feedbacks: " + recent);
    }
}
