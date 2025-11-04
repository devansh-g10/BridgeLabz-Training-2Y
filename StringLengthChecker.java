import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = msg -> msg.length();
        System.out.println(lengthChecker.apply("Hello Java!"));  // 11
    }
}
