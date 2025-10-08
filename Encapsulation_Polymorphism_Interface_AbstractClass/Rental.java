import java.util.ArrayList;
import java.util.List;

// Interface Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Encapsulation: getters and setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void displayDetails() {
        System.out.println(type + " (Vehicle No: " + vehicleNumber + ")");
    }
}

// Car class
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Car rental cost with potential discount for longer rentals
        double baseCost = getRentalRate() * days;
        if (days > 7) {
            baseCost *= 0.90; // 10% discount for rentals longer than 7 days
        }
        return baseCost;
    }

    @Override
    public double calculateInsurance() {
        // Flat insurance cost for demo
        return 100;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy No: " + insurancePolicyNumber;
    }

    // Getter/setter for insurancePolicyNumber with encapsulation
    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
}

// Bike class
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Trucks might charge more for longer durations
        return getRentalRate() * days * 1.2; // 20% surcharge
    }

    @Override
    public double calculateInsurance() {
        // Higher insurance for trucks
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy No: " + insurancePolicyNumber;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
}

// Demo class to showcase polymorphism
public class Rental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 50, "IP12345"));
        vehicles.add(new Bike("BIKE456", 20));
        vehicles.add(new Truck("TRUCK789", 100, "IP67890"));

        for (Vehicle v : vehicles) {
            v.displayDetails();
            double rentalCost = v.calculateRentalCost(10);
            System.out.println("Rental Cost for 10 days: $" + rentalCost);

            if (v instanceof Insurable) {
                Insurable insurable = (Insurable) v;
                double insurance = insurable.calculateInsurance();
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost: $" + insurance);
            } else {
                System.out.println("No insurance applicable.");
            }
            System.out.println();
        }
    }
}