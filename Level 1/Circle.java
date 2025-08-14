// File: Circle.java

class Circle {
    double radius;

    // Default constructor that chains to the parameterized constructor
    public Circle() {
        this(1.0);
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Using the default constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1 area (radius=" + circle1.radius + "): " + String.format("%.2f", circle1.calculateArea()));

        System.out.println();

        // Using the parameterized constructor
        Circle circle2 = new Circle(5.0);
        System.out.println("Circle 2 area (radius=" + circle2.radius + "): " + String.format("%.2f", circle2.calculateArea()));
    }
}
