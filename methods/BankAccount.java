public class BankAccount {
    // Non-static variables (each object has its own)
    String name;
    double balance;
    
    // Static variable (shared by all objects)
    static String bankName = "XYZ Bank";
    
    // Constructor
    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    // Non-static method - needs object to call
    void deposit(double amount) {
        balance += amount;
        System.out.println(name + " deposited $" + amount + ". Balance: $" + balance);
    }
    
    // Static method - can call without object
    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }
    
    public static void main(String[] args) {
        // Static method call - no object needed
        BankAccount.showBankName();
        
        // Create objects
        BankAccount acc1 = new BankAccount("John", 1000);
        BankAccount acc2 = new BankAccount("Jane", 2000);
        
        // Non-static method calls - need objects
        acc1.deposit(500);
        acc2.deposit(300);
        
        System.out.println("\nStatic vs Non-static:");
        System.out.println("Static: Same for all objects");
        System.out.println("Non-static: Different for each object");
    }
}