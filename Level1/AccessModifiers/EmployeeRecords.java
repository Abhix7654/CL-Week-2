// Base class
public class Employee {
    // Public variable
    public int employeeID;

    // Protected variable
    protected String department;

    // Private variable
    private double salary;

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify the salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass to demonstrate access modifiers
class Manager extends Employee {
    private String teamName; // Team managed by the manager

    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        // Accessing public and protected members from the base class
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Public access
        System.out.println("Department: " + department); // Protected access
        System.out.println("Team Name: " + teamName);
    }
}

// Main class to test the implementation
public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee(101, "IT", 50000.0);
        employee.displayEmployeeDetails();

        // Modifying the salary
        System.out.println("\nUpdating Salary...");
        employee.setSalary(55000.0);
        System.out.println("Updated Salary: " + employee.getSalary());

        // Creating a Manager object
        Manager manager = new Manager(201, "HR", 80000.0, "Recruitment Team");
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();
    }
}
