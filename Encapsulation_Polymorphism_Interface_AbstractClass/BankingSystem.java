// Interface Loanable
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew $" + amount + ". New Balance: $" + balance);
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();

    // Encapsulation: getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: $" + balance);
    }
}

// SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // e.g., 4%

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account loan application for $" + amount + " submitted.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        // Simple eligibility check
        return getBalance() >= 5000;
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        // Typically no interest or very low
        return 0;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account loan application for $" + amount + " submitted.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        // Higher eligibility due to overdraft facility
        return getBalance() + overdraftLimit >= 10000;
    }
}

// Demo class
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savingAcc = new SavingsAccount("SA1001", "Alice", 10000, 4.5);
        BankAccount currentAcc = new CurrentAccount("CA2001", "Bob", 5000, 2000);

        savingAcc.displayDetails();
        System.out.println("Interest: $" + savingAcc.calculateInterest());

        currentAcc.displayDetails();
        System.out.println("Interest: $" + currentAcc.calculateInterest());

        // Casting to Loanable to call loan methods
        Loanable savingLoan = (Loanable) savingAcc;
        Loanable currentLoan = (Loanable) currentAcc;

        savingLoan.applyForLoan(15000);
        System.out.println("Loan eligibility: " + savingLoan.calculateLoanEligibility());

        currentLoan.applyForLoan(25000);
        System.out.println("Loan eligibility: " + currentLoan.calculateLoanEligibility());
    }
}