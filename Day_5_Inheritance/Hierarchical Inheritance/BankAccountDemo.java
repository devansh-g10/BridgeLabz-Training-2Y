class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    @SuppressWarnings("FieldMayBeFinal")
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    private final double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    @SuppressWarnings("FieldMayBeFinal")
    private int term; // in months

    public FixedDepositAccount(String accountNumber, double balance, int term) {
        super(accountNumber, balance);
        this.term = term;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Term: " + term + " months");
    }
}

// Demo class to test hierarchical inheritance
public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA1001", 5000.00, 3.5);
        CheckingAccount ca = new CheckingAccount("CA2001", 3000.00, 1000.00);
        FixedDepositAccount fda = new FixedDepositAccount("FDA3001", 10000.00, 12);

        sa.displayAccountType();
        sa.displayInfo();
        System.out.println();

        ca.displayAccountType();
        ca.displayInfo();
        System.out.println();

        fda.displayAccountType();
        fda.displayInfo();
        System.out.println();
    }
}