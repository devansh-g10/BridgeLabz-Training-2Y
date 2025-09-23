interface Worker {
    void performDuties();
}

// Superclass Person
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

// Chef class extends Person and implements Worker
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is preparing food.");
    }
}

// Waiter class extends Person and implements Worker
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving customers.");
    }
}

// Demo class
public class Restaurant {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 101);
        Waiter waiter = new Waiter("Sarah Lee", 201);

        chef.performDuties();
        waiter.performDuties();
    }
}