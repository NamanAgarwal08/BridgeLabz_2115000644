class BankAccount {
    static String bankName = "SBI";
    String accountHolderName;
    final int accountNumber;
    private static int numberOfAccounts;

    BankAccount() { // default constructor
        this("default", 123);
    }

    BankAccount(String accountHolderName, int accountNumber) {
        numberOfAccounts++;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public static void getTotalAccounts(Object b) {
        if (b instanceof BankAccount)
            System.out.println("Total number of accounts are : " + numberOfAccounts);
        else
            System.out.println("Not an instance of BankAccount class");
    }

}