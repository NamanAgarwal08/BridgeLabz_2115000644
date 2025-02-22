package JUnit;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance)
            return false;
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}
