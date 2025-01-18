// Base class
public class Student {
    // Public variable
    public int rollNumber;

    // Protected variable
    protected String name;

    // Private variable
    private double CGPA;

    // Constructor to initialize the student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access the CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify the CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. It should be between 0.0 and 10.0.");
        }
    }

    // Public method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass demonstrating use of protected members
class PostgraduateStudent extends Student {
    private String thesisTopic;

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
        super(rollNumber, name, CGPA);
        this.thesisTopic = thesisTopic;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        // Accessing protected member `name` from the base class
        System.out.println("Postgraduate Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

// Main class to test the implementation
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student(101, "Alice", 9.2);
        student.displayStudentDetails();

        // Accessing and modifying CGPA using public methods
        System.out.println("\nUpdating CGPA...");
        student.setCGPA(8.7);
        System.out.println("Updated CGPA: " + student.getCGPA());

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.5, "Artificial Intelligence");
        System.out.println("\nPostgraduate Student:");
        pgStudent.displayStudentDetails();
        pgStudent.displayPostgraduateDetails();
    }
}
