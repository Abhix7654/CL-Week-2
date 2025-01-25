package IntroductionOfInheritance.employeemanagementsystem;

// Subclass: Manager
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public String displayDetails() {
        return super.displayDetails() + ", Team Size: " + teamSize;
    }
}