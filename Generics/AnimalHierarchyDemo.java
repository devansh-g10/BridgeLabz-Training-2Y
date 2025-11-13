import java.util.*;

class Animal {
    void speak() {
        System.out.println("Some animal sound...");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Meow!");
    }
}

public class AnimalHierarchyDemo {

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.speak();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat(), new Cat());

        System.out.println("Dogs:");
        printAnimals(dogs);

        System.out.println("\nCats:");
        printAnimals(cats);
    }
}
