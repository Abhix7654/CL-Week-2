package HierarchicalInheritance.bankaccountsystem;

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private double maturityAmount;
    private int duration; // in months

    public FixedDepositAccount(String accountNumber, double balance, double maturityAmount, int duration) {
        super(accountNumber, balance);
        this.maturityAmount = maturityAmount;
        this.duration = duration;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Amount: " + maturityAmount + ", Duration: " + duration + " months");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        displayAccountType();
    }
}