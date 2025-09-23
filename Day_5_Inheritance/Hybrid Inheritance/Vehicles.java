interface Refuelable {
    void refuel();
}

// Superclass Vehicle
class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Subclass ElectricVehicle extends Vehicle
class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}

// Subclass PetrolVehicle extends Vehicle and implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling.");
    }
}

// Demo class
public class Vehicles {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle(250, "Tesla Model S");
        PetrolVehicle ford = new PetrolVehicle(220, "Ford Mustang");

        tesla.displayInfo();
        tesla.charge();

        ford.displayInfo();
        ford.refuel();
    }
}