package multiple;

public class Admin implements developer {
    public void manageUsers() {
        System.out.println("Admin managing users.");
    }

    @Override
    public void writeCode() {
        System.out.println("Developer writing code.");
    }

    @Override
    public void browse() {
        System.out.println("Guest browsing the site.");
    }
}
