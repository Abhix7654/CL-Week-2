class Product {
    private static double discount = 10.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
      
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        
    }

    public static void main(String[] args) {
        Product product1 = new Product("P001", "Laptop", 50000.0, 2);
        Product product2 = new Product("P002", "Smartphone", 20000.0, 1);

        Product.updateDiscount(15.0);
if(product1 instanceof Product){
        product1.displayDetails();
}
if(product2 instanceof Product){
        product2.displayDetails();
}


    }

}
