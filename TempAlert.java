import java.util.function.Predicate;

public class TempAlert {
    public static void main(String[] args) {
        Predicate<Double> highTemp = t -> t > 40.0;
        System.out.println(highTemp.test(42.5));  // true
    }
}
