//inheritence
class owner{
    String owner="sundar";
     int age=21;
     int num=123;
}
class ChaiShop extends owner{
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
}

class XeroxShop extends owner {
    String branchName;
    int papersSold;
    int pricePerCopy;
    int numberOfEmployees;

    public XeroxShop(String branchName, int papersSold, int pricePerCopy, int numberOfEmployees) {
        this.branchName = branchName;
        this.papersSold = papersSold;
        this.pricePerCopy = pricePerCopy;
        this.numberOfEmployees = numberOfEmployees;
    }

    void display() {
        System.out.println("branchName: " + branchName);
        System.out.println("papersSold: " + papersSold);
        System.out.println("pricePerCopy: " + pricePerCopy);
        System.out.println("numberOfEmployees: " + numberOfEmployees);
    }
}

class oop {
    public static void main(String[] args) {
        ChaiShop branch1 = new ChaiShop("adda", 70, 5, 3);
        branch1.display();

        System.out.println("-----");

        XeroxShop xeroxBranch = new XeroxShop("shopAdda", 120, 2, 2);
        xeroxBranch.display();
System.out.println(branch1.owner);
System.out.println(xeroxBranch.num);
    }
} 
