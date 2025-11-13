import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30));
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) stack.push(q.remove());
        while (!stack.isEmpty()) q.add(stack.pop());
        System.out.println(q);
    }
}
