class Circle {
    double radius;

    // Default Constructor
    Circle() {
        this(1.0); // Constructor Chaining
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();      // default
        Circle c2 = new Circle(5.5);   // parameterized
        c1.display();
        c2.display();
    }
}
