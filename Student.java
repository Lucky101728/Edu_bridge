public class Student {
    // Data members (attributes)
    int rollNo;
    String name;
    double marks;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor to initialize objects
    public Student(int rollNo, String name, double marks) {
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
        Student s1 = new Student(101, "Aarav", 89.5);

        // Method 2: Assigning values directly via reference variable
        Student s2 = new Student();
        s2.rollNo = 102;
        s2.name = "Diya";
        s2.marks = 94.0;

        // Method 3: Another object with different values
        Student s3 = new Student(103, "Rohan", 76.5);

        // Displaying details of all student objects
        System.out.println("========== Student Details ==========");
        s1.display();
        s2.display();
        s3.display();
    }
}
