import java.util.*;

public class NumericSumDemo {

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30, 40);
        List<Double> doubleList = Arrays.asList(5.5, 10.5, 20.0);

        System.out.println("Sum of Integer List: " + sumNumbers(intList));
        System.out.println("Sum of Double List: " + sumNumbers(doubleList));
    }
}
