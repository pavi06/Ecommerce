package com.example.Ecommerce.DTO;

public class Customer {
    private long cust_id;
    private String cust_name;
    private String cust_mobileno;
    private String cust_email;
    private String cust_Address;

    public Customer(long cust_id,String cust_name, String cust_mobileno, String cust_email, String cust_Address) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.cust_mobileno = cust_mobileno;
        this.cust_email = cust_email;
        this.cust_Address = cust_Address;
    }

    public Customer() {
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

    public long getCust_id() {
        return cust_id;
    }

    public void setCust_id(long cust_id) {
        this.cust_id = cust_id;
    }
}
