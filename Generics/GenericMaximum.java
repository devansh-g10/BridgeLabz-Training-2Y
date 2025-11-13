public class GenericMaximum {

    // Generic method to find maximum
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially largest

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max of 3, 7, 5: " + maximum(3, 7, 5));
        System.out.println("Max of 6.6, 8.8, 7.7: " + maximum(6.6, 8.8, 7.7));
        System.out.println("Max of pear, apple, orange: " + maximum("pear", "apple", "orange"));
    }
}
