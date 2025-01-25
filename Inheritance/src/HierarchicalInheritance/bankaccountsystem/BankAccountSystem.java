package HierarchicalInheritance.bankaccountsystem;

public class BankAccountSystem {
    public static void main(String[] args) {

        // Create instances of SavingsAccount, CheckingAccount, and FixedDepositAccount
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 2000.0, 500.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000.0, 15000.0, 12);

        // Display details of each account
        System.out.println("Savings Account Details:");
        savings.displayDetails();

        System.out.println("\nChecking Account Details:");
        checking.displayDetails();

        System.out.println("\nFixed Deposit Account Details:");
        fixedDeposit.displayDetails();
    }
}
