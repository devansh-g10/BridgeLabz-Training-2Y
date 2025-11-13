import java.util.*;

public class CopyListDemo {

    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number num : src) {
            dest.add(num);
        }
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> srcInt = Arrays.asList(10, 20, 30);
        List<Double> srcDouble = Arrays.asList(5.5, 6.6);

        // Copy integers
        copyList(dest, srcInt);

        // Copy doubles
        copyList(dest, srcDouble);

        System.out.println("Combined Destination List: " + dest);
    }
}
