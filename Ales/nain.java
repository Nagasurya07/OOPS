//multi level inheritance
//inheritence
class owner{
    String owner="sundar";
     int age=21;
     int num=123;
       
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
    
    
}

class room extends chaiShop{
int roomno=4;
int capacity=3;
}
class nain {
    public static void main(String[] args) {
        ChaiShop branch1 = new ChaiShop("adda", 70, 5, 3);
        branch1.fun(); // Output: 1
        room r1 = new room();
        System.out.println("Room Number: " + r1.roomno);

        System.out.println("Capacity: " + r1.capacity);
                System.out.println("Capacity: " + r1.owner);

    }
}