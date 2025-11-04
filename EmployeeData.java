import java.util.*;

public class EmployeeData {
    public static void main(String[] args) {
        int[] ages = {22, 35, 28, 40, 19};
        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages)
            list.add(age); // auto-boxing

        System.out.println("Youngest: " + Collections.min(list));
        System.out.println("Oldest: " + Collections.max(list));
    }
}
