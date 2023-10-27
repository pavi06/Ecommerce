package com.example.Ecommerce.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Customers")
public class CustomerEntity {

    @Column(name = "CustomerId", length = 10)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cust_id;
    @Column(name = "CustomerName", length = 50)
    private String cust_name;
    @Column(name = "MobileNumber", length = 12)
    private String cust_mobileno;
    @Column(name = "EmailId", length = 45)
    private String cust_email;
    @Column(name = "CustomerAddress", length = 200)
    private String cust_Address;

    public CustomerEntity() {
    }

    public CustomerEntity(long cust_id, String cust_name, String cust_mobileno, String cust_email, String cust_Address) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.cust_mobileno = cust_mobileno;
        this.cust_email = cust_email;
        this.cust_Address = cust_Address;
    }

    public CustomerEntity(String cust_name, String cust_mobileno, String cust_email, String cust_Address) {
        this.cust_name = cust_name;
        this.cust_mobileno = cust_mobileno;
        this.cust_email = cust_email;
        this.cust_Address = cust_Address;
    }

    public long getCust_id() {
        return cust_id;
    }

    public void setCust_id(long cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_mobileno() {
        return cust_mobileno;
    }

    public void setCust_mobileno(String cust_mobileno) {
        this.cust_mobileno = cust_mobileno;
    }

    public String getCust_email() {
        return cust_email;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    public String getCust_Address() {
        return cust_Address;
    }

    public void setCust_Address(String cust_Address) {
        this.cust_Address = cust_Address;
    }
}
