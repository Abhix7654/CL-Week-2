package IntroductionOfInheritance.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        // Create instances of nested classes
        Manager manager = new Manager("Raj", 101, 80000, 10);
        Developer developer = new Developer("Rahul", 102, 60000, "Java");
        Intern intern = new Intern("Abhi", 103, 20000, 6);

        // Display details of each employee
        System.out.println(manager.displayDetails());
        System.out.println(developer.displayDetails());
        System.out.println(intern.displayDetails());
    }
}
