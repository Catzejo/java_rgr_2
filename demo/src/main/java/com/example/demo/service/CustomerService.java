package com.example.demo.service;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;

import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private UserRepo userRepo;

    public Customer createCustomer(CustomerEntity customer, Long userId) {
        UserEntity user = userRepo.findById(userId).get();
        customer.setUser(user);
        return Customer.toModel(customerRepo.save(customer));
    }
    public Long delete(Long id) {
        customerRepo.deleteById(id);
        return id;
    }

}
