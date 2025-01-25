package bankingsystem;

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01; // 1% annual interest
    private static final double LOAN_ELIGIBILITY_FACTOR = 0.5; // 50% of balance
    private double loanAmount;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public boolean applyForLoan(double loanAmount) {
        double eligibility = calculateLoanEligibility();
        if (loanAmount > eligibility) {
            System.out.println("Loan application denied. Maximum eligible amount: " + eligibility);
            return false;
        }
        this.loanAmount = loanAmount;
        System.out.println("Loan application approved for: " + loanAmount);
        return true;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LOAN_ELIGIBILITY_FACTOR;
    }
}