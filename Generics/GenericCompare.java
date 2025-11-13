public class GenericCompare {

    // Generic method to check equality
    public static <T> boolean isEqual(T a, T b) {
        if (a == null || b == null) {
            return a == b; // handles null safely
        }
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(10, 10));            // true
        System.out.println(isEqual("Hello", "Hello"));  // true
        System.out.println(isEqual("Java", "Python"));  // false
        System.out.println(isEqual(12.5, 12.6));        // false
    }
}
