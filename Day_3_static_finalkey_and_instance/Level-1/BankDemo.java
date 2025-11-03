class BankAccount {
    static String bankName = "ABC Bank";   // static shared variable
    private static int totalAccounts = 0;

    private final String accountHolderName;
    private final int accountNumber;  // final so cannot change later

    // Constructor using 'this'
    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Display details
    void displayDetails() {
        if (this instanceof BankAccount) {   // instanceof check
            System.out.println("Bank: " + bankName +
                    ", Holder: " + accountHolderName +
                    ", Account No: " + accountNumber);
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("John", 101);
        BankAccount a2 = new BankAccount("Alice", 102);

        a1.displayDetails();
        a2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}
