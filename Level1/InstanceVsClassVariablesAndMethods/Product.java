public class Product {
    // Class variable to keep track of total products
    private static int totalProducts = 0;

    // Instance variables
    private String productName;
    private double price;

    // Constructor to initialize instance variables and update the totalProducts count
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display the total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Laptop", 50000);
        Product product2 = new Product("Smartphone", 30000);

        // Displaying individual product details
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Displaying the total number of products
        Product.displayTotalProducts();
    }
}
