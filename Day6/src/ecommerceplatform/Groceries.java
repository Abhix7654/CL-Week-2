package ecommerceplatform;

// Groceries class
class Groceries extends Product {
    private double discount;

    public Groceries(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount < 0) {
            throw new IllegalArgumentException("Discount cannot be negative");
        }
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return discount;
    }
}
