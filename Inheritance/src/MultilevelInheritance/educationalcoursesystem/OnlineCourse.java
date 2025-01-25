package MultilevelInheritance.educationalcoursesystem;

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public String getCourseDetails() {
        return super.getCourseDetails() +
                ", Platform: " + platform +
                ", Recorded: " + (isRecorded ? "Yes" : "No");
    }

    @Override
    public void displayCourseInfo() {
        System.out.println(getCourseDetails());
    }
}