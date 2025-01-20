class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    public void displayDetails() {
       
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Bank Name: " + bankName);
        
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Abhi ", 101);
        BankAccount account2 = new BankAccount("Abhixhek", 102);

if(account1 instanceof BankAccount){
        account1.displayDetails();
}
if(account2 instanceof BankAccount){
        account1.displayDetails();
}

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }


}
