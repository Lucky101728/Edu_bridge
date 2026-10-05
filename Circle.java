public class Circle {
    // Field (attribute)
    double radius;

    // Default constructor
    public Circle() {
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle: Area = π * r^2
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate and return the circumference of the circle: Circumference = 2 * π * r
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void display() {
        System.out.printf("Radius        : %.2f%n", radius);
        System.out.printf("Area          : %.2f%n", calculateArea());
        System.out.printf("Circumference : %.2f%n", calculateCircumference());
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        // Creating first Circle object using parameterized constructor
        Circle c1 = new Circle(7.0);

        // Creating second Circle object and assigning radius directly
        Circle c2 = new Circle();
        c2.radius = 3.5;

        // Displaying results
        System.out.println("=========== Circle 1 ===========");
        c1.display();

        System.out.println("=========== Circle 2 ===========");
        c2.display();
    }
}
