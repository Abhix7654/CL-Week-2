// Base class
public class BankAccount {
    // Public variable
    public String accountNumber;

    // Protected variable
    protected String accountHolder;

    // Private variable
    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the account balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Public method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass to demonstrate access modifiers
class SavingsAccount extends BankAccount {
    private double interestRate; // Interest rate for savings account

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        // Accessing public and protected members from the base class
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Public access
        System.out.println("Account Holder: " + accountHolder); // Protected access
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to test the implementation
public class BankAccountManagement {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("123456789", "Alice", 5000.0);
        account.displayAccountDetails();

        // Depositing and withdrawing money
        System.out.println("\nTransaction Operations:");
        account.deposit(2000.0);
        account.withdraw(1500.0);
        System.out.println("Updated Balance: " + account.getBalance());

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Bob", 10000.0, 4.5);
        System.out.println("\nSavings Account:");
        savingsAccount.displaySavingsAccountDetails();
    }
}
