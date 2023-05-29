package company.model.flourProduct;

import company.model.Product;

import java.time.LocalDate;

public class Pasta extends Product {
    public Pasta(int id, String name, String companyName, LocalDate expirationDate) {
        super(id, name, companyName, expirationDate);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCompanyName() {
        return super.getCompanyName();
    }

    @Override
    public void setCompanyName(String companyName) {
        super.setCompanyName(companyName);
    }

    @Override
    public LocalDate getExpirationDate() {
        return super.getExpirationDate();
    }

    @Override
    public void setExpirationDate(LocalDate expirationDate) {
        super.setExpirationDate(expirationDate);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
