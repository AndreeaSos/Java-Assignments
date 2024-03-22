package isp.lab3;

import isp.lab3.exercise5.Product;
import isp.lab3.exercise5.VendingMachine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    @Test
    public void testDisplayProduct(){
        Product p1=new Product(4,"Banane",10,5);
        Product p2=new Product(6,"Mere",1,18);
        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.addProduct(p1);
        vendingMachine.addProduct(p2);
        assertEquals(p1.getId()+". " +p1.getName()+"\n" + p2.getId()+". " +p2.getName()+"\n" ,
                vendingMachine.displayProduct());


    }

    @Test
    public void testSelectProduct(){
        Product p1=new Product(4,"Banane",10,5);
        Product p2=new Product(6,"Mere",1,18);
        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.addProduct(p1);
        vendingMachine.addProduct(p2);
        assertEquals(p1.getName() ,
                vendingMachine.selectProduct(4));


    }

    @Test
    public void testInsertCoin(){
        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.insertCoin(10);
        assertEquals(10 ,
                vendingMachine.getCredit());


    }


}
