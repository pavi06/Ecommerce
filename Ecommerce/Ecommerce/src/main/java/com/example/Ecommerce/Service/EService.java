package com.example.Ecommerce.Service;

import com.example.Ecommerce.DTO.AddCustomer;
import com.example.Ecommerce.DTO.Customer;

import java.util.List;

public interface EService {
    long addNewCustomer(AddCustomer addCustomer);

    List<Customer> getCustomers();
}
