 class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking(); // default
        HotelBooking b2 = new HotelBooking("Ravi", "Deluxe", 3); // parameterized
        HotelBooking b3 = new HotelBooking(b2); // copy
        b1.display();
        b2.display();
        b3.display();
    }
}
 
