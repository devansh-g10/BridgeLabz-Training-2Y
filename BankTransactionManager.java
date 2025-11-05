class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String msg) { super(msg); }
}
class InsufficientFundsException3 extends Exception {
    public InsufficientFundsException3(String msg) { super(msg); }
}

public class BankTransactionManager {

    public static void verifyAccount(String accNo) throws AccountNotFoundException {
        if (!accNo.equals("12345")) {
            throw new AccountNotFoundException("Account not found!");
        }
    }

    public static void processTransaction(int amount) throws InsufficientFundsException3 {
        if (amount > 5000) {
            throw new InsufficientFundsException3("Insufficient balance for this transaction!");
        }
        System.out.println("Transaction successful of ₹" + amount);
    }

    public static void executeTransaction() throws Exception {
        verifyAccount("54321");
        processTransaction(6000);
    }

    public static void main(String[] args) {
        try {
            executeTransaction();
        } catch (AccountNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException3 e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
