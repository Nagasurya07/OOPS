package inheritance;

public class user {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.browse();       // Inherited from guest
        admin.writeCode();    // Inherited from developer
        admin.manageUsers();  // Defined in Admin
    }
}
