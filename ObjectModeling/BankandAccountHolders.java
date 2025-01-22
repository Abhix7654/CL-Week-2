import java.util.ArrayList; // Import ArrayList to manage lists of accounts and customers

// Class representing a bank account
class Account {
    private int accountNumber; // Unique identifier for the account
    private double balance;    // Current balance of the account

    // Constructor to initialize account details
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for the account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for the balance of the account
    public double getBalance() {
        return balance;
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        balance += amount; // Increase balance by the deposited amount
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount; // Deduct the amount if sufficient balance is available
        } else {
            System.out.println("Insufficient balance!"); // Print error message if funds are insufficient
        }
    }

    // Override toString to provide a custom string representation of the account
    @Override
    public String toString() {
        return "Account [Account Number: " + accountNumber + ", Balance: $" + balance + "]";
    }
}

// Class representing a customer
class Customer {
    private String name;                 // Name of the customer
    private ArrayList<Account> accounts; // List of accounts owned by the customer

    // Constructor to initialize customer details
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>(); // Initialize an empty list of accounts
    }

    // Method to add an account to the customer's list of accounts
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to view the balances of all the customer's accounts
    public void viewBalance() {
        System.out.println(name + "'s Accounts:");
        for (Account account : accounts) {
            System.out.println(account); // Print the details of each account
        }
    }
}

// Class representing a bank
class Bank {
    private String bankName;              // Name of the bank
    private ArrayList<Customer> customers; // List of customers of the bank

    // Constructor to initialize the bank details
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>(); // Initialize an empty list of customers
    }

    // Method to add a customer to the bank
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account); // Add the account to the customer's account list
    }

    // Method to show all customers of the bank
    public void showCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer customer : customers) {
            System.out.println(customer); // Print the details of each customer
        }
    }
}

// Main class to demonstrate the functionality of Bank, Customer, and Account classes
public class BankExample {
    public static void main(String[] args) {
        // Create a bank object
        Bank bank = new Bank("National Bank");

        // Create customer objects
        Customer customer1 = new Customer("raj ");
        Customer customer2 = new Customer("muskan ");

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Create account objects
        Account account1 = new Account(101, 1000.0); // Account for customer1
        Account account2 = new Account(102, 2000.0); // Account for customer2

        // Open accounts for the customers
        bank.openAccount(customer1, account1);
        bank.openAccount(customer2, account2);

        // Display the balances of customer1 and customer2
        customer1.viewBalance();
        customer2.viewBalance();
    }
}
