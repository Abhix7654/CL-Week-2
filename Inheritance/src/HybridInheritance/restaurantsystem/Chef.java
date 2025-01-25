package HybridInheritance.restaurantsystem;

// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing dishes. Specialty: " + specialty);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Chef, Specialty: " + specialty);
    }
}