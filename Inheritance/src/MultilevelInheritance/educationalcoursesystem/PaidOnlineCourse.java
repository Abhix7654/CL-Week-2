package MultilevelInheritance.educationalcoursesystem;

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public String getCourseDetails() {
        return super.getCourseDetails() +
                ", Fee: $" + fee +
                ", Discount: " + discount + "%" +
                ", Final Fee: $" + calculateFinalFee();
    }

    @Override
    public void displayCourseInfo() {
        System.out.println(getCourseDetails());
    }
}