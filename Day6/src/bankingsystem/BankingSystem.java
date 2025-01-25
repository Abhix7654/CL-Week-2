package bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {
        // Create instances of different account types
        BankAccount savingsAccount = new SavingsAccount("SA12345", "Abhishek", 5000);
        CurrentAccount currentAccount = new CurrentAccount("CA67890", "Rahul", 10000);

        // Polymorphic list of accounts
        BankAccount[] accounts = {savingsAccount, currentAccount};

        // Process accounts dynamically
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanableAccount.calculateLoanEligibility());
                loanableAccount.applyForLoan(4000); // Example loan application
            }

            System.out.println();
        }

        // Test deposit and withdraw methods
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(2000);

        currentAccount.deposit(5000);
        currentAccount.withdraw(7000);
    }
}
