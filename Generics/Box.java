// Generic Box Example
public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        // Integer Box
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer Value: " + intBox.get());

        // String Box
        Box<String> strBox = new Box<>();
        strBox.set("Hello Java Generics!");
        System.out.println("String Value: " + strBox.get());

        // Double Box
        Box<Double> dblBox = new Box<>();
        dblBox.set(99.99);
        System.out.println("Double Value: " + dblBox.get());
    }
}
