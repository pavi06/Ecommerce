package com.example.Ecommerce.Service;

import com.example.Ecommerce.DTO.AddCustomer;
import com.example.Ecommerce.DTO.Customer;
import com.example.Ecommerce.Entity.CustomerEntity;
import com.example.Ecommerce.Repository.ERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EServiceImpl implements EService {

    @Autowired
    private ERepository eRepository;

    @Override
    public long addNewCustomer(AddCustomer addCustomer) {
        CustomerEntity customer = new CustomerEntity(
                addCustomer.getCust_name(),addCustomer.getCust_mobileno(),addCustomer.getCust_email(),addCustomer.getCust_Address()
        );
        eRepository.save(customer);
        return customer.getCust_id();
    }


    @Override
    public List<Customer> getCustomers(){
       List<CustomerEntity> allCustomer = eRepository.findAll();
       List<Customer>  customers = new ArrayList<>();
       for(CustomerEntity cust : allCustomer){
           Customer c = new Customer(
                   cust.getCust_id(),
                   cust.getCust_name(),
                   cust.getCust_mobileno(),
                   cust.getCust_email(),
                   cust.getCust_Address()
           );
           customers.add(c);
       }
        return customers;
    }
}
