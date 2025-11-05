public class NestedTryCatchPropagation {

    public static void methodB() {
        try {
            String num = "abc";
            int val = Integer.parseInt(num); // NumberFormatException handled here
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException in methodB");
        }

        // This exception is not handled here
        String str = null;
        System.out.println(str.length()); // NullPointerException propagates
    }

    public static void methodA() {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Exception propagated to methodA: " + e);
        }
    }

    public static void main(String[] args) {
        methodA();
    }
}
