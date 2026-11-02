public class student {
    // Data members (attributes)
    int rollNo;
    String name;
    double marks;

    // Default constructor
    public student() {
    }

    // Parameterized constructor to initialize objects
    public student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student information
    public void display() {
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        // Method 1: Initializing using a parameterized constructor
        student s1 = new student(101, "Aarav", 89.5);

        // Method 2: Assigning values directly via reference variable
        student s2 = new student();
        s2.rollNo = 102;
        s2.name = "Diya";
        s2.marks = 94.0;

        // Method 3: Another object with different values
        student s3 = new student(103, "Rohan", 76.5);

        // Displaying details of all student objects
        System.out.println("========== Student Details ==========");
        s1.display();
        s2.display();
        s3.display();
    }
}
