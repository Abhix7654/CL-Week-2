// Course Class - Represents a course offered in the university
class Course {
    private String name; // Name of the course

    // Constructor to initialize the course with its name
    public Course(String name) {
        this.name = name;
    }

    // Getter method to retrieve the course name
    public String getName() {
        return name;
    }
}

// Professor Class - Represents a professor in the university
class Professor {
    private String name; // Name of the professor

    // Constructor to initialize the professor with their name
    public Professor(String name) {
        this.name = name;
    }

    // Getter method to retrieve the professor's name
    public String getName() {
        return name;
    }

    // Method to assign the professor to a specific course
    public void assignProfessor(Course course) {
        System.out.println(name + " is assigned to teach the course " + course.getName());
    }
}

// Student Class - Represents a student in the university
class Student {
    private String name; // Name of the student

    // Constructor to initialize the student with their name
    public Student(String name) {
        this.name = name;
    }

    // Getter method to retrieve the student's name
    public String getName() {
        return name;
    }

    // Method for the student to enroll in a specific course
    public void enrollCourse(Course course) {
        System.out.println(name + " enrolled in the course " + course.getName());
    }
}

// Main class to demonstrate the University Management System
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a course object with the name "Data Structures"
        Course course = new Course("Data Structures");

        // Create a professor object with the name "Dr. Lee"
        Professor professor = new Professor("Dr. Lee");

        // Create a student object with the name "David"
        Student student = new Student("David");

        // Assign the professor to the course
        professor.assignProfessor(course);

        // Enroll the student in the course
        student.enrollCourse(course);
    }
}
