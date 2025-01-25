package MultilevelInheritance.educationalcoursesystem;

// Base Class: Course
class Course {
    protected String courseName;
    protected int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseDetails() {
        return "Course Name: " + courseName + ", Duration: " + duration + " hours";
    }

    public void displayCourseInfo() {
        System.out.println(getCourseDetails());
    }
}