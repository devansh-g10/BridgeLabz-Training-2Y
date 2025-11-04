public class BankTransactionLimit {
    public static double remainingLimit(Double limit, double withdrawn) {
        if (limit == null) return 0.0;
        return limit - withdrawn;
    }

    public static void main(String[] args) {
        Double limit = 10000.0;
        System.out.println("Remaining: " + remainingLimit(limit, 2500));
        System.out.println("Old account: " + remainingLimit(null, 1000));
    }
}
