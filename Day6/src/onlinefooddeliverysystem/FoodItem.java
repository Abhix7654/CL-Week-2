package onlinefooddeliverysystem;

// Abstract class for food items
abstract class FoodItem {
    private final String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    // Methods
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
    }

    // Abstract method
    public abstract double calculateTotalPrice();
}