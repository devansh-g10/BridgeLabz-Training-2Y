import java.util.ArrayList;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Auto-boxing
        for (int i = 1; i <= 10; i += 2) {
            list.add(i);
        }

        int sum = 0;
        // Auto-unboxing
        for (int num : list) {
            sum += num;
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
