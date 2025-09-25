package encapsulation_demo;

public class EncapsulationDemo {
    public static void main(String[] args) {
        EncapsulatedBankAccount acct = new EncapsulatedBankAccount("ACC123", "Surya", 1000);
        System.out.println("Created: " + acct);

        acct.deposit(250);
        System.out.println("After deposit: balance=" + acct.getBalance());

        acct.withdraw(300);
        System.out.println("After withdraw: balance=" + acct.getBalance());

        // Change owner via a validated setter
        acct.setOwnerName("Nagasurya");
        System.out.println("Updated owner: " + acct.getOwnerName());

        // The following lines would not compile if uncommented, demonstrating encapsulation:
        // acct.balance = 1_000_000; // Error: balance is private
        // acct.accountNumber = "HACK"; // Error: accountNumber is private and final
    }
}
