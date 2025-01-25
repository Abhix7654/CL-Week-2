package onlinefooddeliverysystem;

// VegItem class
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double discountRate) {
        double discount = calculateTotalPrice() * discountRate / 100;
        return calculateTotalPrice() - discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg items are eligible for a 10% discount.";
    }
}