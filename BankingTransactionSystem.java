import java.util.Random;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String msg) { super(msg); }
}
class InsufficientFundsException2 extends Exception {
    public InsufficientFundsException2(String msg) { super(msg); }
}
class NetworkFailureException extends Exception {
    public NetworkFailureException(String msg) { super(msg); }
}

class Transaction {
    public void process(int amount) throws NegativeAmountException, InsufficientFundsException2, NetworkFailureException {
        Random rand = new Random();
        int n = rand.nextInt(3);
        if (n == 0) throw new NegativeAmountException("Amount cannot be negative!");
        else if (n == 1) throw new InsufficientFundsException2("Not enough balance!");
        else throw new NetworkFailureException("Network issue! Try again later.");
    }
}

public class BankingTransactionSystem {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.process(1000);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException2 e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}
