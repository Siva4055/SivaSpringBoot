package com.hyd.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyd.customer.entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer> {

}
