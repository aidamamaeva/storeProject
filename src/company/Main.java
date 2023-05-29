package company;

import company.model.MeatProduct.Fish;
import company.model.MilkProduct.Milk;
import company.model.Product;
import company.model.flourProduct.Bread;
import company.model.flourProduct.Flour;
import company.service.Manager;
import company.service.ProductService;
import company.service.ProductServiceImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Manager manager = new Manager();
        manager.setLogin("aida2");
        manager.setPassword("1234567");
        Bread bread = new Bread(1,"bread", "NUR", LocalDate.parse("01.06.2023", DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        Flour flour = new Flour(2, "flour", "jj",LocalDate.parse("02.08.2025", DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        Fish fish = new Fish(3,"tuna", "TOIBOSS", LocalDate.parse("31.06.2023", DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        Milk milk = new Milk(4,"milk", "MILKA",LocalDate.parse("10.02.2023", DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        ProductService productService = new ProductServiceImpl();
        productService.addProduct(bread);
        productService.addProduct(flour);
        productService.addProduct(fish);
        productService.addProduct(milk);
        productService.sortByDate();
        productService.checkDiscountedProducts();
        productService.showAllProducts("aida2", "1234567", manager);

    }
}