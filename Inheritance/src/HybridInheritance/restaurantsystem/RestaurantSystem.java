package HybridInheritance.restaurantsystem;

public class RestaurantSystem {
    public static void main(String[] args) {

        // Create instances of Chef and Waiter
        Chef chef = new Chef(" Rams", 101, "indian ");
        Waiter waiter = new Waiter("jai", 102, 5);

        // Display details and perform duties
        chef.displayDetails();
        chef.performDuties();

        System.out.println();

        waiter.displayDetails();
        waiter.performDuties();
    }
}
