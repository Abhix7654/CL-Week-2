import java.util.ArrayList; // Import ArrayList to manage lists of students and courses

// Class representing a Course
class Course {
    private String courseName;                 // Name of the course
    private ArrayList<Student> enrolledStudents; // List of students enrolled in the course

    // Constructor to initialize the course name and create an empty student list
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Method to display all students enrolled in the course
    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName()); // Print the name of each student
        }
    }

    // Getter to retrieve the course name
    public String getCourseName() {
        return courseName;
    }
}

// Class representing a Student
class Student {
    private String name;                // Name of the student
    private ArrayList<Course> courses; // List of courses the student is enrolled in

    // Constructor to initialize the student's name and create an empty course list
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method for a student to enroll in a course
    public void enrollInCourse(Course course) {
        courses.add(course);          // Add the course to the student's list of courses
        course.enrollStudent(this);   // Add the student to the course's list of enrolled students
    }

    // Method to display all courses the student is enrolled in
    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(course.getCourseName()); // Print the name of each course
        }
    }

    // Getter to retrieve the student's name
    public String getName() {
        return name;
    }
}

// Class representing a School
class School {
    private String name;                // Name of the school
    private ArrayList<Student> students; // List of students in the school

    // Constructor to initialize the school name and create an empty student list
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display all students in the school
    public void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println(student.getName()); // Print the name of each student
        }
    }
}

// Main class to demonstrate the functionality of School, Student, and Course
public class SchoolExample {
    public static void main(String[] args) {
        // Create a school object
        School school = new School("Greenfield High");

        // Create student objects
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create course objects
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Display all students in the school
        school.showStudents();

        // Display students enrolled in each course
        course1.showEnrolledStudents();
        course2.showEnrolledStudents();

        // Display all courses a student is enrolled in
        student1.showCourses();
    }
}
