public class MobilePhone {
    // Private member variables to store mobile phone details
    private String brand;
    private String model;
    private int price;

    // Constructor to initialize the mobile phone details
    public MobilePhone(String brand, String model, int price) {
        this.brand = brand; // Assign brand name
        this.model = model; // Assign model name
        this.price = price; // Assign price
    }

    // Method to display the details of the mobile phone
    public void display() {
        // Print the details of mobile
        System.out.println("The brand of MobilePhone: " + brand+" The model of MobilePhone: " + model+" The price of MobilePhone: " + price);
     
}

}
// Main Class to Test
public class Main{
public static void main(String[] args){

       // Create a MobilePhone object with brand, model, and price
        MobilePhone mobilePhone = new MobilePhone("Xiaomi", "Note10 pro max", 24000);

        // Display the details of the mobile phone
        mobilePhone.display();
    }
}

