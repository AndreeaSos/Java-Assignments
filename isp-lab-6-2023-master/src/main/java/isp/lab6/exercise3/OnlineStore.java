package isp.lab6.exercise3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineStore {
    private List<Product> products;
    private Map<String,ActiveSession> sessions;

    public List<Product> getProducts(){
        return this.products;
    }
    public List<Product> getProductsSorted(Comparator<Product> sortCriteria){
        this.products.sort(sortCriteria);
        return this.products;
    }
    private void addSession(String username){
        this.sessions.put(username,new ActiveSession(username));
    }
    protected void removeSession(String username){
        this.sessions.remove(username);
    }
    public void addToCart(String username,Product product,int quantity){
        Map<Product,Integer> map=new HashMap<>();
        map.put(product,quantity);
        ActiveSession activeSession=new ActiveSession(username,map);
        this.sessions.put(username,activeSession);
    }

    public String checkout(String username){
        this.sessions.get(username).setShoppingCart(new HashMap<>());
        return "the cart was emptied with success";
    }
}
