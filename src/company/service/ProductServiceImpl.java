package company.service;

import company.dao.ProductDao;
import company.model.Product;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;

public class ProductServiceImpl implements ProductService{
    private ProductDao productDao = new ProductDao();

    @Override
    public void addProduct(Product product) {
    String  companyName = product.getCompanyName();
        LocalDate currentDate = LocalDate.now();
        LocalDate expirationDate = product.getExpirationDate();
        if(companyName.equals("MILKA") || companyName.equals("NUR")|| companyName.equals("TOIBOSS") ){
            if(expirationDate.equals(currentDate)|| expirationDate.isAfter(currentDate)){
                productDao.getProducts().add(product);
            }  else{
                System.out.println("у продукта " + product +" истек срок годности" );
            }
        }else {
            System.out.println("мы не можем принять продукт данного производителя " + product.getCompanyName());
    }}

    @Override
    public void sortByDate() {
        Comparator<Product> productComparator = Comparator.comparing(Product::getExpirationDate);
        Collections.sort(productDao.getProducts(), productComparator);
    }

    @Override
    public void checkDiscountedProducts() {
        LocalDate currentDate = LocalDate.now();
        for (int i = 0; i < productDao.getProducts().size(); i++) {
            if(productDao.getProducts().get(i).getExpirationDate().minusWeeks(1).isBefore(currentDate)){
                productDao.getDiscountProducts().add(productDao.getProducts().get(i));
            }
        }
    }

    @Override
    public void showAllProducts(String username, String password,Manager manager) {
        if(username.equals(manager.getLogin()) && password.equals(manager.getPassword())) {
            System.out.println("Products:");
            System.out.println(productDao.getProducts());
            if(productDao.getDiscountProducts() != null) {
                System.out.println("Discounted products:");
            System.out.println(productDao.getDiscountProducts());}
        }else System.out.println("доступ запрещен");


    }
}
