class Student {
    private static String universityName = "National University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
       
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        
    }

    public static void main(String[] args) {
        Student student1 = new Student("rahul", 1001, "A");
        Student student2 = new Student("shreya", 1002, "B");
if(student1 instanceof Student){
        student1.displayDetails();
}
if(student2 instanceof Student){
        student2.displayDetails();
}

    

        Student.displayTotalStudents();
    }


}
