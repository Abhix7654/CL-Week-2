class Employee {
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
       
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 1, "Software Engineer");
        Employee emp2 = new Employee("Bob", 2, "Project Manager");

      
if(emp1 instanceof Employee){
        emp1.displayDetails();
}
if(emp2 instanceof Employee){
        emp2.displayDetails();
}

        Employee.displayTotalEmployees();
    }
}
