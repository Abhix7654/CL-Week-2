package HierarchicalInheritance.schoolhierarchy;

public class SchoolHierarchy {
    public static void main(String[] args) {
        SchoolHierarchy school = new SchoolHierarchy();

        // Create instances of Teacher, Student, and Staff
        Teacher teacher = new Teacher("Mr. Sharma", 35, "Mathematics");
        Student student = new Student("Ananya", 16, "10th Grade");
        Staff staff = new Staff("Mrs. Verma", 40, "Administration");

        // Display details of each role
        System.out.println("Teacher Details:");
        teacher.displayDetails();

        System.out.println("\nStudent Details:");
        student.displayDetails();

        System.out.println("\nStaff Details:");
        staff.displayDetails();
    }
}
