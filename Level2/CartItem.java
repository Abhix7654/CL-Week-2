
class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter for itemName
    public String getItemName() {
        return itemName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Method to calculate the total cost of the item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println(itemName + " | Price: $" + price + " | Quantity: " + quantity + " | Total: $" + getTotalCost());
    }
}
import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> cartItems; // List to store CartItem objects

    // Constructor
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println("Added " + itemName + " to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean found = false;
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(i);
                System.out.println("Removed " + itemName + " from the cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item " + itemName + " not found in the cart.");
        }
    }

    // Method to display the total cost of all items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalCost();
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    // Method to display all items in the cart
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (CartItem item : cartItems) {
                item.displayItem();
            }
        }
    }


} import java.util.Scanner;

// Main method for testing
class Main{
     // Main method to simulate the shopping cart system
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        int choice;
        do {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter the name of the item to remove: ");
                    String removeItem = scanner.nextLine();
                    cart.removeItem(removeItem);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    cart.displayTotalCost();
                    break;

                case 5:
                    System.out.println("Exiting the Shopping Cart. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}


