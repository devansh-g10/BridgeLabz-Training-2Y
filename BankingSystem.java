import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("ACC101", 15000.0);
        accounts.put("ACC102", 50000.0);
        accounts.put("ACC103", 7500.0);
        accounts.put("ACC104", 30000.0);

        // Deposit
        accounts.put("ACC101", accounts.get("ACC101") + 5000);

        // Withdraw with balance check
        double withdraw = 8000;
        String acc = "ACC103";
        if (accounts.get(acc) >= withdraw)
            accounts.put(acc, accounts.get(acc) - withdraw);
        else
            System.out.println("Insufficient balance for " + acc);

        // Sorted by balance (descending)
        System.out.println("\nCustomers sorted by balance:");
        accounts.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + ": ₹" + e.getValue()));

        // Top 3 customers
        System.out.println("\nTop 3 Customers:");
        accounts.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + ": ₹" + e.getValue()));
    }
}
