// Class Definition
public class Circle{

 // Fields (Attributes)
private double radius;
private double area;
private double circumference;

  // Constructor
public Circle(double radius){
this.radius=radius;

}

 // Method to calculate Area of circle
public void calculateArea(double radius){

this.area=(22/7)*radius*radius;
}
 // Method to calculate Circumference of circle
public void calculateCircumference(double radius){

this.circumference=2*(22/7)*radius;
}

//Method to Display area and circumference
public void displayResult(){

//Calling method
calculateArea(radius);
calculateCircumference(radius);

System.out.printf("Area is %.2f%n",area);
System.out.printf("Circumference is %.2f%n",circumference);


}

}

// Main Class to Test
public class Main{
public static void main(String[] args){

  // Create Circle objects
Circle circle=new Circle(5);
Circle circle1=new Circle(5.4);


 // Display area and circumference
circle.displayResult();
circle1.displayResult();
}
}


