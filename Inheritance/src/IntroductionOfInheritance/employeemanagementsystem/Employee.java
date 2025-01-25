package IntroductionOfInheritance.employeemanagementsystem;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String displayDetails() {
        return "Name: " + name + ", ID: " + id + ", Salary: " + salary;
    }
}