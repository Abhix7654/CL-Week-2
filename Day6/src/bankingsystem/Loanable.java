package bankingsystem;

// Interface for loanable accounts
interface Loanable {
    boolean applyForLoan(double loanAmount);
    double calculateLoanEligibility();
}
