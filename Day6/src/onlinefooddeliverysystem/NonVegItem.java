package onlinefooddeliverysystem;


// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_EXTRA_CHARGE = 50.0; // Additional charge per unit

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_EXTRA_CHARGE) * getQuantity();
    }

    @Override
    public double applyDiscount(double discountRate) {
        double discount = calculateTotalPrice() * discountRate / 100;
        return calculateTotalPrice() - discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-veg items are eligible for a 5% discount.";
    }
}