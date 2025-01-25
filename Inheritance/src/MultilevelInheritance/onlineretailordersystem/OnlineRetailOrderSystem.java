package MultilevelInheritance.onlineretailordersystem;

public class OnlineRetailOrderSystem {
    public static void main(String[] args) {

        // Create instances of Order, ShippedOrder, and DeliveredOrder
        Order order = new Order("ORD001", "2025-01-20");
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2025-01-18", "TRACK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2025-01-15", "TRACK67890", "2025-01-22");

        // Display order details and statuses
        System.out.println("Base Order:");
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());

        System.out.println("\nShipped Order:");
        shippedOrder.displayOrderDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());

        System.out.println("\nDelivered Order:");
        deliveredOrder.displayOrderDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
