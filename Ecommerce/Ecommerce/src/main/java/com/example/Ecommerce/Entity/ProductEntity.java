package com.example.Ecommerce.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Products")
public class ProductEntity {
    @Column(name = "ProductId", length = 10)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long prod_id;
    @Column(name = "Product", length = 50)
    private String prod_name;
    @Column(name = "Price", length = 12)
    private double prod_price;

    @Column(name = "Quantity", length = 10)
    private int prod_quantity;

    public ProductEntity() {
    }

    public ProductEntity(String prod_name, double prod_price,int prod_quantity) {
        this.prod_name = prod_name;
        this.prod_price = prod_price;
        this.prod_quantity = prod_quantity;
    }

    public ProductEntity(long prod_id, String prod_name, double prod_price,int prod_quantity) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.prod_price = prod_price;
        this.prod_quantity = prod_quantity;
    }

    public long getProd_id() {
        return prod_id;
    }

    public void setProd_id(long prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public double getProd_price() {
        return prod_price;
    }

    public void setProd_price(double prod_price) {
        this.prod_price = prod_price;
    }
}
