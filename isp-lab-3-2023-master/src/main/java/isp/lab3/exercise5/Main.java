package isp.lab3.exercise5;

public class Main {
    public static void main(String[] args) {
        Product p1=new Product(4,"Banane",10,5);
        Product p2=new Product(6,"Mere",1,18);
        Product p3=new Product(15,"Pere",0,2);

        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.insertCoin(10);
        vendingMachine.addProduct(p1);
        vendingMachine.addProduct(p3);
        vendingMachine.addProduct(p2);

        vendingMachine.displayCredit();
        System.out.println("\n");
        vendingMachine.displayProduct();
        System.out.println("\n");
        System.out.println(vendingMachine.selectProduct(22));
        System.out.println("\n");
        vendingMachine.userMenu();

    }
}
