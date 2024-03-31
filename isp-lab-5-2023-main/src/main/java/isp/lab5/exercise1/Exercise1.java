package isp.lab5.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        Customer c1=new Customer("01","Geza","0755434711",new Address("Crangului","Sighisoara"));
        Address a1=c1.getAddress();
        a1.setCity("Budapesta");
        a1.setStreet("Podului");
        System.out.println("new customer redisterede: "+c1.toString());

        Product p1=new Product("123","iPhone 12 mini",(double)3400,ProductCategory.ELECTRONICS);
        System.out.println("new product in store "+p1.toString());
        Product p2=new Product("183","Samsung ",(double)2800,ProductCategory.ELECTRONICS);
        System.out.println("new product in store "+p2.toString());
        Product p3=new Product("173","spuma par ",(double)12,ProductCategory.BEAUTY);
        System.out.println("new product in store "+p3.toString());

        List<Product> productList=new ArrayList<>();
        Order o1=new Order("1", LocalDateTime.now(),productList,c1);

        System.out.println("new order created "+o1.toString());

    }

}
