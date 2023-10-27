package com.example.Ecommerce.Controller;

import com.example.Ecommerce.DTO.AddCustomer;
import com.example.Ecommerce.DTO.Customer;
import com.example.Ecommerce.Entity.CustomerEntity;
import com.example.Ecommerce.Service.EService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private EService EService;

    @PostMapping(path = "/addCustomer")
    public long addCustomer(@RequestBody AddCustomer addCustomer){
        long id = EService.addNewCustomer(addCustomer);
        return id;
    }

    @GetMapping(path = "/getCustomer")
    public List<Customer> getCustomers(){
        List<Customer> customers = EService.getCustomers();
        return customers;
    }


    @DeleteMapping(path = "/deleteCustomer")
    public String  deleteCustomer(){
        return "";
    }





}
