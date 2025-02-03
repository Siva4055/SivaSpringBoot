package com.hyd.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyd.customer.entity.CustomerEntity;
import com.hyd.customer.repo.CustomerRepo;

@Service
public class CustomerService {
	
	
	@Autowired
	CustomerRepo cusRepo;
	
	     public void addNewCus(CustomerEntity customer) {
	    	 
	    	 cusRepo.save(customer);
	     }

}
