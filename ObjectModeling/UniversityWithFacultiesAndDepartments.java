// Department Class (Composition with University)
class Department {
    private String name; // Name of the department

    // Constructor to initialize the department name
    public Department(String name) {
        this.name = name;
    }

    // Getter method to retrieve the department name
    public String getName() {
        return name;
    }
}

// Faculty Class (Aggregation with Department)
class Faculty {
    private String name; // Name of the faculty member

    // Constructor to initialize the faculty name
    public Faculty(String name) {
        this.name = name;
    }

    // Getter method to retrieve the faculty name
    public String getName() {
        return name;
    }
}

// University Class
class University {
    private String name;                 // Name of the university
    private Department[] departments;    // Composition - University owns the departments
    private Faculty[] faculties;         // Aggregation - Faculties exist independently of the university

    // Constructor to initialize the university with its name, departments, and faculties
    public University(String name, Department[] departments, Faculty[] faculties) {
        this.name = name;
        this.departments = departments;
        this.faculties = faculties;
    }

    // Getter method to retrieve the university name
    public String getName() {
        return name;
    }

    // Method to delete the university, which also deletes its departments (composition)
    public void deleteUniversity() {
        departments = null; // Departments are removed since they are part of the university
        System.out.println("University deleted, Departments also deleted.");
    }

    // Method to print details about the university, including its departments and faculties
    public void printDetails() {
        System.out.println("University: " + name);
        
        System.out.println("Departments:");
        if (departments != null) { // Check if departments exist before printing
            for (Department department : departments) {
                System.out.println("- " + department.getName());
            }
        } else {
            System.out.println("No departments available (University deleted).");
        }

        System.out.println("Faculties:");
        for (Faculty faculty : faculties) { // Faculties exist independently, so always print
            System.out.println("- " + faculty.getName());
        }
    }
}

// Main class to demonstrate the functionality
public class UniversityApp {
    public static void main(String[] args) {
        // Create department objects
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mechanical Engineering");

        // Create faculty objects
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");

        // Initialize arrays of departments and faculties
        Department[] departments = {d1, d2};
        Faculty[] faculties = {f1, f2};

        // Create a university object with departments and faculties
        University university = new University("Tech University", departments, faculties);

        // Print details of the university, including its departments and faculties
        university.printDetails();

        // Delete the university, which also deletes its departments
        university.deleteUniversity();

        // Attempt to print university details after deletion
        university.printDetails(); // Departments should no longer exist, but faculties will still be shown
    }
}
