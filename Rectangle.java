public class Rectangle {
    // Fields (attributes)
    double length;
    double breadth;

    // Default constructor
    public Rectangle() {
    }

    // Parameterized constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }

    // Method to display rectangle details
    public void display() {
        System.out.println("Length : " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area   : " + calculateArea());
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        // Creating first Rectangle object using parameterized constructor
        Rectangle rect1 = new Rectangle(10.5, 5.0);

        // Creating second Rectangle object and setting values directly
        Rectangle rect2 = new Rectangle();
        rect2.length = 7.0;
        rect2.breadth = 4.5;

        // Displaying results
        System.out.println("========== Rectangle 1 ==========");
        rect1.display();

        System.out.println("========== Rectangle 2 ==========");
        rect2.display();
    }
}
