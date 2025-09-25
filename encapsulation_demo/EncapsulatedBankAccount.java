package encapsulation_demo;

/**
 * Encapsulation demo:
 * - Private fields hide the internal state (data hiding)
 * - Public methods provide a controlled API (getters/setters/behavior)
 * - Validation keeps the object in a valid state
 */
public class EncapsulatedBankAccount {
    // Internal state is hidden from the outside world
    private final String accountNumber; // immutable once set
    private String ownerName;
    private double balance;

    public EncapsulatedBankAccount(String accountNumber, String ownerName, double openingBalance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("accountNumber is required");
        }
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("ownerName is required");
        }
        if (openingBalance < 0) {
            throw new IllegalArgumentException("openingBalance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = openingBalance;
    }

    // Read-only accessors (no direct setters for sensitive fields like balance)
    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName() { return ownerName; }
    public double getBalance() { return balance; }

    // Controlled mutation with validation
    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("ownerName is required");
        }
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("deposit amount must be > 0");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("withdraw amount must be > 0");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("insufficient funds");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account[" + accountNumber + ", owner=" + ownerName + ", balance=" + balance + "]";
    }
}
