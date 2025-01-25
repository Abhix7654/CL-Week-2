package IntroductionOfInheritance.employeemanagementsystem;

// Subclass: Intern
class Intern extends Employee {
    private int internshipDuration; // in months

    public Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    public String displayDetails() {
        return super.displayDetails() + ", Internship Duration: " + internshipDuration + " months";
    }
}