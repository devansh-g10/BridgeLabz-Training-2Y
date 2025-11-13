import java.util.*;

// Base class
class Vehicle {
    String name;
    Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (" + getClass().getSimpleName() + ")";
    }
}

class Truck extends Vehicle {
    Truck(String name) {
        super(name);
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }
}

// Generic FleetManager
class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    public void showFleet() {
        System.out.println("Fleet List:");
        for (T v : fleet) {
            System.out.println(" - " + v);
        }
    }
}

public class FleetManagerDemo {
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Volvo Truck"));
        truckFleet.addVehicle(new Truck("Tata Truck"));

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Yamaha"));
        bikeFleet.addVehicle(new Bike("Royal Enfield"));

        System.out.println("Truck Fleet:");
        truckFleet.showFleet();

        System.out.println("\nBike Fleet:");
        bikeFleet.showFleet();
    }
}
