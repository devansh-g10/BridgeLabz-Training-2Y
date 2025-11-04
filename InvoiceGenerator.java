import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    int id;
    Invoice(int id) {
        this.id = id;
        System.out.println("Invoice created for Transaction ID: " + id);
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        List<Integer> transactionIDs = Arrays.asList(101, 102, 103);

        List<Invoice> invoices = transactionIDs.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());
    }
}
