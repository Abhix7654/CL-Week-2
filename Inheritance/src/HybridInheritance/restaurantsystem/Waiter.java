package HybridInheritance.restaurantsystem;

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers. Tables Assigned: " + tablesAssigned);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Waiter, Tables Assigned: " + tablesAssigned);
    }
}