package IntroductionOfInheritance.employeemanagementsystem;

// Subclass: Developer
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String displayDetails() {
        return super.displayDetails() + ", Programming Language: " + programmingLanguage;
    }
}