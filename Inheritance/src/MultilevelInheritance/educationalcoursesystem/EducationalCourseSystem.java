package MultilevelInheritance.educationalcoursesystem;

public class EducationalCourseSystem {
    public static void main(String[] args) {

        // Create instances of Course, OnlineCourse, and PaidOnlineCourse
        Course basicCourse = new Course("Java Basics", 40);
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 50, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Java Certification", 60, "Coursera", true, 200.0, 20.0);

        // Display course details
        System.out.println("Basic Course:");
        basicCourse.displayCourseInfo();

        System.out.println("\nOnline Course:");
        onlineCourse.displayCourseInfo();

        System.out.println("\nPaid Online Course:");
        paidOnlineCourse.displayCourseInfo();
    }
}
