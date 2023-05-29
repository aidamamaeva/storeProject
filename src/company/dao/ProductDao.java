package company.dao;

import company.model.Product;

import java.util.LinkedList;
import java.util.List;

public class ProductDao {
    private List<Product> products = new LinkedList<>();
    private List<Product> discountProducts = new LinkedList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getDiscountProducts() {
        return discountProducts;
    }

    public void setDiscountProducts(List<Product> discountProducts) {
        this.discountProducts = discountProducts;
    }
}
