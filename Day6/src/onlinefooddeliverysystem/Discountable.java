package onlinefooddeliverysystem;

// Interface for applying discounts
interface Discountable {
    double applyDiscount(double discountRate); // Returns final price after discount
    String getDiscountDetails();
}
