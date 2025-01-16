public class Item {
    // Private member variables to store item details
    private int itemCode;
    private String itemName;
    private int price;

    // Constructor to initialize the item details
    public Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode; // Assign item code
        this.itemName = itemName; // Assign item name
        this.price = price; // Assign item price
    }

    // Method to display the details of the item
    public void display() {
        // Print the item details
        System.out.println("Item Code :" + itemCode+" Item Name :" + itemName+" Item price :" + price);
     
    }
}


// Main Class to Test
public class Main{
public static void main(String[] args){

        // Create an Item object with item code, name, and price
        Item item = new Item(00223, "xyz", 3000);

        // Display the details of the item
        item.display();
    }
}

