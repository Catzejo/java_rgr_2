package com.example.demo.repository;

import com.example.demo.entity.PetEntity;
import org.springframework.data.repository.CrudRepository;

public interface PetRepo extends CrudRepository<PetEntity,Long> {
}
