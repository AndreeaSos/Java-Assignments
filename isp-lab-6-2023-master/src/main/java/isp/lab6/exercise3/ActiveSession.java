package isp.lab6.exercise3;

import java.util.HashMap;
import java.util.Map;

public class ActiveSession {
    private String username;
    private Map<Product,Integer> shoppingCart;

    public void addToCart(Product product,int quantity){
        this.shoppingCart.put(product,quantity);
    }

    public ActiveSession(String username) {
        this.username = username;
        this.shoppingCart=new HashMap<>();
    }

    public ActiveSession(String username, Map<Product, Integer> shoppingCart) {
        this.username = username;
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Map<Product, Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
