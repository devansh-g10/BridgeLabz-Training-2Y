public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double obj = 45.67;

        double d = obj;        // unboxing
        int i = (int) d;       // casting

        System.out.println("Double object: " + obj);
        System.out.println("Primitive double: " + d);
        System.out.println("Converted int: " + i);
    }
}
