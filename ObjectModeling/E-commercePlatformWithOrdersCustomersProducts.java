// Product Class
class Product {
    private String name;      // Name of the product
    private double price;     // Price of the product

    // Constructor to initialize product name and price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter method to retrieve the product name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the product price
    public double getPrice() {
        return price;
    }
}

// Order Class
class Order {
    private Product[] products;    // Array of products in the order
    private double totalAmount;    // Total amount for the order

    // Constructor to initialize the order with a list of products
    public Order(Product[] products) {
        this.products = products;
        calculateTotalAmount(); // Calculate the total amount when the order is created
    }

    // Private method to calculate the total amount for the order
    private void calculateTotalAmount() {
        totalAmount = 0; // Initialize total amount to zero
        for (Product product : products) { // Iterate over each product in the order
            totalAmount += product.getPrice(); // Add the price of the product to the total amount
        }
    }

    // Getter method to retrieve the total amount of the order
    public double getTotalAmount() {
        return totalAmount;
    }
}

// Customer Class
class Customer {
    private String name; // Name of the customer

    // Constructor to initialize the customer with their name
    public Customer(String name) {
        this.name = name;
    }

    // Getter method to retrieve the customer's name
    public String getName() {
        return name;
    }

    // Method to place an order and display a message with the total amount
    public void placeOrder(Order order) {
        System.out.println(name + " placed an order with total amount: $" + order.getTotalAmount());
    }
}

// Main class to demonstrate the e-commerce application
public class ECommerceApp {
    public static void main(String[] args) {
        // Create product objects with name and price
        Product p1 = new Product("Laptop", 800); // Laptop priced at $800
        Product p2 = new Product("Mouse", 25);   // Mouse priced at $25

        // Create an array of products to include in the order
        Product[] products = {p1, p2};

        // Create an order with the products
        Order order = new Order(products);

        // Create a customer object with a name
        Customer customer = new Customer("John Doe");

        // Customer places the order, and the total amount is displayed
        customer.placeOrder(order);
    }
}
