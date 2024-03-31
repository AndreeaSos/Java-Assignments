package isp.lab5.exercise1;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String orderId;
    private LocalDateTime date;
    private double totalPrice;
    private List<Product> products;
    private Customer customer;

    public Order(String orderId, LocalDateTime date, List<Product> products, Customer customer) {
        this.orderId = orderId;
        this.date = date;
        this.products = products;
        this.customer = customer;
        calculateTotalPrice();
    }

    public Order(String orderId, LocalDateTime date, List<Product> products) {
        this.orderId = orderId;
        this.date = date;
        this.products = products;
        calculateTotalPrice();
    }

    public void calculateTotalPrice(){
        this.totalPrice=0;
        for (int i = 0; i <products.size() ; i++) {
            this.totalPrice+=products.get(i).getPrice();
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
        calculateTotalPrice();
    }

    public String getOrderId() {
        return orderId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", date=" + date +
                ", totalPrice=" + totalPrice +
                ", products=" + products +
                ", customer=" + customer.toString() +
                '}';
    }
}
