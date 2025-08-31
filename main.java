//method overloading 
class ChaiShop {
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

    void fun() {
        System.out.println(1); // ✅ Semicolon added
    }
    void fun(int a) {
        System.out.println(2); // ✅ Semicolon added
    }
     void fun(int a , int b) {
        System.out.println(3); // ✅ Semicolon added
    }
       void fun(int a , String b) {
        System.out.println(4); // ✅ Semicolon added
    }
          void fun( String b,int a ) {
        System.out.println(5); // ✅ Semicolon added
    }
}

class Main {
    public static void main(String[] args) {
        ChaiShop branch1 = new ChaiShop("adda", 70, 5, 3);
        branch1.fun(); // Output: 1
         branch1.fun(4);
         branch1.fun(4,5);
          branch1.fun(4,"boom");
           branch1.fun("boom",4);
    }
}