package ecommerceplatform;

// Interface for taxable products
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}