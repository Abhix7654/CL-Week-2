package onlinefooddeliverysystem;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Create instances of food items
        FoodItem vegItem = new VegItem("Paneer Tikka", 200.0, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300.0, 3);

        // Polymorphic list of food items
        FoodItem[] order = {vegItem, nonVegItem};

        // Process the order
        System.out.println("Order Details:");
        for (FoodItem item : order) {
            item.getItemDetails();
            double totalPrice = item.calculateTotalPrice();

            // Apply discount if applicable
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                double discountedPrice = discountableItem.applyDiscount(item instanceof VegItem ? 10 : 5);
                System.out.println("Total Price (Before Discount): " + totalPrice);
                System.out.println("Total Price (After Discount): " + discountedPrice);
                System.out.println(discountableItem.getDiscountDetails());
            }

            System.out.println();
        }
    }

}
