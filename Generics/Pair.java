// Generic Pair Example
public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Amol", 20);
        System.out.println("Name: " + student.getFirst());
        System.out.println("Age: " + student.getSecond());

        Pair<Integer, String> idName = new Pair<>(101, "Rahul");
        System.out.println("ID: " + idName.getFirst());
        System.out.println("Name: " + idName.getSecond());
    }
}
