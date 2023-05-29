package company.service;

import company.model.Product;

public interface ProductService {
    void addProduct(Product product);
    void sortByDate ();
    void checkDiscountedProducts();

    void showAllProducts(String username, String password, Manager manager);
}
