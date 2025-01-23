class Customer {
    String name;
    List<Product> products;

    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}

class Product {
    String name;
    double pricePerUnit;
    double quantity;

    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }
}

class BillGenerator {
    public double calculateTotalBill(List<Product> products) {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }
}
public class Main {
    public static void main(String[] args) {
 
        Customer customer = new Customer("Abhi");
        customer.addProduct(new Product("Apples", 3.0, 2.0));
        customer.addProduct(new Product("Milk", 2.0, 1.0));

        BillGenerator billGenerator = new BillGenerator();
        double totalBill = billGenerator.calculateTotalBill(customer.getProducts());
        System.out.println("Customer: " + customer.name + ", Total Bill: $" + totalBill);
    }
}