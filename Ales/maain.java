//method overriding
//inheritence
class owner{
    String owner="sundar";
     int age=21;
     int num=123;
        void fun() {
        System.out.println(2); // ✅ Semicolon added
    }
}
class ChaiShop extends owner {
    String branchName;
    int cupsSold;
    int pricePerCup;
    int numberOfEmployees;

    public ChaiShop(String branchName, int cupsSold, int pricePerCup, int numberOfEmployees) {
        this.branchName = branchName;
        this.cupsSold = cupsSold;
        this.pricePerCup = pricePerCup;
        this.numberOfEmployees = numberOfEmployees;
    }

    void display() {
        System.out.println("branchName: " + branchName);
        System.out.println("cupsSold: " + cupsSold);
        System.out.println("pricePerCup: " + pricePerCup);
        System.out.println("numberOfEmployees: " + numberOfEmployees);
    }
    @Override
    void fun() {
        System.out.println(1); // ✅ Semicolon added
    }
   
}

class Maain {
    public static void main(String[] args) {
        ChaiShop branch1 = new ChaiShop("adda", 70, 5, 3);
        branch1.fun(); // Output: 1
       
    }
}