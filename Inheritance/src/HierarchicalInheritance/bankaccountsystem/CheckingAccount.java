package HierarchicalInheritance.bankaccountsystem;

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        displayAccountType();
    }
}