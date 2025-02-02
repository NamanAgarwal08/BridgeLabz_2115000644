public class SavingsAccount extends BankAccount {
    
    String accountType;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, String accountType) {
        super(accountNumber, accountHolder, balance);
        this.accountType = accountType;
    }

    public void displaySavingsDetails() {

        System.out.println("Account Number: " + this.accountNumber);
        
        System.out.println("Account Holder: " + this.accountHolder); // accessing protected instance

        System.out.println("Balance: " + this.getBalance()); // accessing through getter

        System.out.println("Account Type: " + this.accountType);
    
    }
}
