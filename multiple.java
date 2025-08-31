// Interface representing the owner of the chai shop
interface Owner {
    String ONAME = "Sundar"; // Constant owner name
}

// Interface representing the chaipodi supplier
interface ChaipodiSupplier {
    String SNAME = "Ramababu"; // Constant supplier name
}

// Class implementing both interfaces
class ChaiShop implements Owner, ChaipodiSupplier {
    
    // Method to display detail
}

// Main class to run the program
public class multiple {
    public static void main(String[] args) {
        // Creating a ChaiShop object
        ChaiShop shop = new ChaiShop();

        // Accessing interface constants and displaying shop info
        System.out.println("Owner Name         : " + shop.ONAME);
        System.out.println("Supplier Name      : " + shop.SNAME);

        
    }
}
