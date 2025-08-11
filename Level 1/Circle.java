public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public void displayDetails() {
        double area = this.calculateArea();
        double circumference = this.calculateCircumference();
        System.out.println("Circle with Radius: " + this.radius);
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Circumference: %.2f\n", circumference);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        circle1.displayDetails();
    }
}