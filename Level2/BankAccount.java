public class BankAccount {
    // Attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize the BankAccount
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
    // Method to display account details
   public void displayDetails() {

System.out.println(" AccountHolder Name: " + accountHolder);
System.out.println(" AccountNumber Name: " + accountNumber);

        System.out.println("Current Balance: $" + balance);
    }


    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

  import java.util.Scanner;
  // Main method for testing
class Main{
    // Main method to test the ATM simulation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a bank account object
        BankAccount account = new BankAccount("Abhishek Kumar", "123456789", 1000.0);

        // ATM interaction loop
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Balance");
            System.out.println("4. Display Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;
                  case 4:
                       account.displayDetails();
                        break;
                case 5:
                    System.out.println("Exiting... Thank you for using the ATM.");
                    break;
              

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
