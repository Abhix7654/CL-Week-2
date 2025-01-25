package ecommerceplatform;

public class ECommercePlatform {
    public static void main(String[] args) {
        // Create product instances
        Product electronics = new Electronics(101, "Smartphone", 50000, 0.10);
        Product clothing = new Clothing(102, "Jacket", 3000, 500);
        Product groceries = new Groceries(103, "Apples", 200, 20);

        // Polymorphic array of products
        Product[] products = {electronics, clothing, groceries};

        // Calculate and display final price for each product
        for (Product product : products) {
            product.displayDetails();
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);

            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println();
        }
    }
}
