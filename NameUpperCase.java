import java.util.*;
import java.util.stream.Collectors;

public class NameUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("devansh", "amol", "riya", "arjun");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}
