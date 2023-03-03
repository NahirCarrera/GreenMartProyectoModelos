package ec.edu.espe.decisiontree.model;

import java.time.LocalDate;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Product {
    private String name;
    private LocalDate expireDate;
    private float salesRate;
    private float price;
    private float discount;


    public Product(String name, LocalDate expireDate, float salesRate, float price, float discount) {
        this.name = name;
        this.expireDate = expireDate;
        this.salesRate = salesRate;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "(name=" + name + ", descuento=" + discount + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public float getSalesRate() {
        return salesRate;
    }

    public void setSalesRate(float salesRate) {
        this.salesRate = salesRate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float decuento) {
        this.discount = decuento;
    }


    
}



