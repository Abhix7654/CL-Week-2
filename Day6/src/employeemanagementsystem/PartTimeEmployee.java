package employeemanagementsystem;

// Part-time employee subclass
class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        if (workHours < 0) {
            throw new IllegalArgumentException("Work hours cannot be negative");
        }
        this.workHours = workHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly rate must be positive");
        }
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
