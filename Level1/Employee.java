// Class Definition
public class Employee{

 // Fields (Attributes)
private String name;
private int id;
private double salary;

  // Constructor
public Employee(String name,int id,double salary){
this.name=name;
this.id=id;
this.salary=salary;
}

 // Method to display Employee details
public void displayDetails(){
System.out.println("Employee name is"+name+". His id no is"+id+" and his salary is"+salary);
}

}


// Main Class to Test
public class Main{
public static void main(String[] args){

  // Create Employee objects
Employee employee1=new Employee("Abhishek",02,2000);
Employee employee2=new Employee("Rahul",01,5000);

 // Display details of each Employee
employee1.displayDetails();
employee2.displayDetails();
}
}
