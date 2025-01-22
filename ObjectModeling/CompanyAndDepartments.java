import java.util.ArrayList; // Import ArrayList to manage lists of employees and departments

// Class representing an Employee
class Employee {
    private String name; // Name of the employee

    // Constructor to initialize the employee's name
    public Employee(String name) {
        this.name = name;
    }

    // Getter to retrieve the employee's name
    public String getName() {
        return name;
    }

    // Override toString to provide a custom string representation of the employee
    @Override
    public String toString() {
        return "Employee [Name: " + name + "]";
    }
}

// Class representing a Department
class Department {
    private String departmentName;        // Name of the department
    private ArrayList<Employee> employees; // List of employees in the department

    // Constructor to initialize the department name and create an empty employee list
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display all employees in the department
    public void showEmployees() {
        System.out.println("Employees in " + departmentName + ":");
        for (Employee employee : employees) {
            System.out.println(employee); // Print the details of each employee
        }
    }
}

// Class representing a Company
class Company {
    private String companyName;             // Name of the company
    private ArrayList<Department> departments; // List of departments in the company

    // Constructor to initialize the company name and create an empty department list
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display all departments in the company
    public void showDepartments() {
        System.out.println("Departments in " + companyName + ":");
        for (Department department : departments) {
            System.out.println(department); // Print the details of each department
        }
    }
}

// Main class to demonstrate the functionality of Company, Department, and Employee
public class CompanyExample {
    public static void main(String[] args) {
        // Create a company object
        Company company = new Company("Tech Solutions");

        // Create department objects
        Department itDept = new Department("IT Department");
        Department hrDept = new Department("HR Department");

        // Add departments to the company
        company.addDepartment(itDept);
        company.addDepartment(hrDept);

        // Create employee objects
        Employee emp1 = new Employee("rahul");
        Employee emp2 = new Employee("nitesh");
        Employee emp3 = new Employee("vikash");

        // Add employees to their respective departments
        itDept.addEmployee(emp1);
        itDept.addEmployee(emp2);
        hrDept.addEmployee(emp3);

        // Display all departments in the company
        company.showDepartments();

        // Display employees in each department
        itDept.showEmployees();
        hrDept.showEmployees();

        // Simulate deleting the company
        System.out.println("\nDeleting the company...");
        // When the company is deleted, its departments and employees will no longer be referenced
        // This illustrates how associated objects are tied to the lifecycle of the company
    }
}
