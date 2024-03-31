package isp.lab5.exercise1;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Radu Miron
 * @version 1
 */
public class Exercise1Test {
    @Test
    public void ProductTest(){
        Product p1=new Product("111","Ruj",(double) 25,ProductCategory.BEAUTY);
        Product p2=new Product("333","iPhone 12 mini",(double) 4500,ProductCategory.ELECTRONICS);
        Product p3=new Product("379","Lopata",(double) 28,ProductCategory.HOME_AND_GARDEN);
        Assert.assertEquals("Product{productId='111', name='Ruj', price=25.0, productCategory=self care products}",p1.toString());
        Assert.assertEquals("Product{productId='333', name='iPhone 12 mini', price=4500.0, productCategory=Electronics & Gadgets}",p2.toString());
        Assert.assertEquals("Product{productId='379', name='Lopata', price=28.0, productCategory=home and gardening tools}",p3.toString());
    }

    @Test
    public void OrderTest(){
        Product p1=new Product("111","Ruj",(double) 25,ProductCategory.BEAUTY);
        Product p2=new Product("333","iPhone 12 mini",(double) 4500,ProductCategory.ELECTRONICS);
        Product p3=new Product("379","Lopata",(double) 28,ProductCategory.HOME_AND_GARDEN);
        Customer c1=new Customer("30","andreea","254446",new Address("Crangului","Sighisoara"));

        List<Product> products=new ArrayList<>();
        products.add(p1);products.add(p2);products.add(p3);
        Order o1=new Order("1", LocalDateTime.now(),products,c1);
        Assert.assertEquals("Order{orderId='1', date=26/3/2024, totalPrice=4553, products=, customer=}",o1.toString());
    }
    
}
