class Customer {
    String name;
    double balance;

    Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c, double amount) {
        c.balance += amount;
        System.out.println("Account opened for " + c.name + " in " + bankName);
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        Bank b1 = new Bank("SBI");
        Customer c1 = new Customer("Rahul");

        b1.openAccount(c1, 5000);
        c1.viewBalance();
    }
}
