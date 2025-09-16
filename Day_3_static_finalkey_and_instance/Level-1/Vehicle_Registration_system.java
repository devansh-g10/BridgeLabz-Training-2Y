class Vehicle {
    static double registrationFee = 5000; // shared
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayVehicle() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName +
                    ", Type: " + vehicleType +
                    ", Reg No: " + registrationNumber +
                    ", Fee: " + registrationFee);
        }
    }
}

public class Vehicle_Registration_system {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Amit", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Sita", "Bike", "MH14XY5678");

        v1.displayVehicle();
        v2.displayVehicle();
    }
}
