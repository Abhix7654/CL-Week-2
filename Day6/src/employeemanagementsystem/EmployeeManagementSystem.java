package employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create employees
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(101, "Abhi", 50000, 10000);
        fullTimeEmp.assignDepartment("Software Engineer");

        PartTimeEmployee partTimeEmp = new PartTimeEmployee(102, "Muskan", 0, 20, 500);
        partTimeEmp.assignDepartment("HR");

        // Polymorphic list of employees
        Employee[] employees = {fullTimeEmp, partTimeEmp};

        // Display details and salaries
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}