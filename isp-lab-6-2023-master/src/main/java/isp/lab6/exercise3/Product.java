package isp.lab6.exercise3;

import java.util.Objects;

public class Product implements Comparable {
    public String name;
    public int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
