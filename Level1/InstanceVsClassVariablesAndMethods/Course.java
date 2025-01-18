public class Course {
    // Instance variables
    private String courseName;
    private int duration; // Duration in hours
    private double fee;

    // Class variable
    private static String instituteName = "Default Institute";

    // Constructor to initialize instance variables
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fee: " + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Update institute name
        Course.updateInstituteName("TechLearn Academy");

        // Creating courses
        Course course1 = new Course("Java Programming", 40, 5000);
        Course course2 = new Course("Web Development", 60, 8000);

        // Displaying course details
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
