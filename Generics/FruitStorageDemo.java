import java.util.*;

class Fruit {
    String name;
    Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Apple extends Fruit {
    Apple(String name) {
        super(name);
    }
}

class Mango extends Fruit {
    Mango(String name) {
        super(name);
    }
}

class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void displayFruits() {
        for (T f : fruits) {
            System.out.println(f);
        }
    }
}

public class FruitStorageDemo {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.addFruit(new Apple("Red Apple"));
        appleBox.addFruit(new Apple("Green Apple"));

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.addFruit(new Mango("Alphonso"));
        mangoBox.addFruit(new Mango("Kesar"));

        System.out.println("Apples in Box:");
        appleBox.displayFruits();

        System.out.println("\nMangoes in Box:");
        mangoBox.displayFruits();

        
    }
}
