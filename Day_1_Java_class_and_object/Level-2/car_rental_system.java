class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000; // Example fixed rate

    // Default Constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void display() {
        System.out.println("Customer: " + customerName + 
                           ", Car: " + carModel + 
                           ", Days: " + rentalDays + 
                           ", Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental(); // default
        CarRental r2 = new CarRental("Neha", "SUV", 5); // parameterized
        r1.display();
        r2.display();
    }
}
