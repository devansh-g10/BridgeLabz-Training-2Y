import java.util.*;

// ✅ Account class
class Account {
    String accNumber;
    double balance;

    public Account(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public String toString() {
        return accNumber + " (Balance: ₹" + balance + ")";
    }
}

// ✅ Transaction class
class Transaction {
    String accNumber;
    double amount;
    String type; // "DEPOSIT" or "WITHDRAW"

    public Transaction(String accNumber, double amount, String type) {
        this.accNumber = accNumber;
        this.amount = amount;
        this.type = type;
    }

    public String toString() {
        return type + " ₹" + amount + " in " + accNumber;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // ✅ Valid account set
        Set<String> validAccounts = new HashSet<>();
        validAccounts.add("ACC101");
        validAccounts.add("ACC102");
        validAccounts.add("ACC103");

        // ✅ Queue for pending transactions
        Queue<Transaction> transactionQueue = new LinkedList<>();

        // ✅ List for all processed transactions
        List<Transaction> transactionHistory = new ArrayList<>();

        // ✅ Stack for rollback functionality
        Stack<Transaction> rollbackStack = new Stack<>();

        // ✅ Add some transactions
        transactionQueue.add(new Transaction("ACC101", 1000, "DEPOSIT"));
        transactionQueue.add(new Transaction("ACC102", 500, "WITHDRAW"));
        transactionQueue.add(new Transaction("ACC999", 200, "DEPOSIT")); // Invalid
        transactionQueue.add(new Transaction("ACC103", 700, "DEPOSIT"));

        System.out.println("Pending Transactions: " + transactionQueue);

        // ✅ Process each transaction
        while (!transactionQueue.isEmpty()) {
            Transaction t = transactionQueue.poll();

            if (validAccounts.contains(t.accNumber)) {
                System.out.println("Processing: " + t);
                transactionHistory.add(t);
                rollbackStack.push(t);
            } else {
                System.out.println("❌ Invalid account: " + t.accNumber + " — Skipped!");
            }
        }

        // ✅ Show all processed transactions
        System.out.println("\n✅ Transaction History:");
        for (Transaction t : transactionHistory) {
            System.out.println(t);
        }

        // ✅ Rollback last transaction
        if (!rollbackStack.isEmpty()) {
            Transaction last = rollbackStack.pop();
            System.out.println("\n🔁 Rolling back last transaction: " + last);
        }
    }
}
