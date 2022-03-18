package com.example.demo.repository;

import com.example.demo.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<CustomerEntity, Long> {
}
