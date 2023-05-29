package company.model;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String companyName;
    private LocalDate  expirationDate;

    public Product(int id, String name, String companyName, LocalDate expirationDate) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.expirationDate = expirationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
