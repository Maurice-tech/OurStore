package org.TeamStore;

public class Product {
    private String pname;
    private Double price;
    private int quantity;

    public Product(String pname, Double price, int quantity) {
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
