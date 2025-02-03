package com.hyd.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hyd.customer.entity.CustomerEntity;
import com.hyd.customer.service.CustomerService;

@RestController
public class CustomerController {
	
	
  @Autowired
	CustomerService cusSer;
  
    @PostMapping("/customer1/customer/add")
    public String createNewCustomer(@RequestBody CustomerEntity customer) {
    	
    	System.out.println("from  browser data ---->" + customer);
    	
    	cusSer.addNewCus(customer);
    	
    	
    	
    
		return "successfully added new customer ---->" +customer.getName();
    	
    }
    
}


