package com.example.demo.service;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.PetEntity;
import com.example.demo.model.Pet;
import com.example.demo.repository.CustomerRepo;
import com.example.demo.repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private PetRepo petRepo;

    public Pet createPet(PetEntity pet, Long custId) {
        CustomerEntity customer = customerRepo.findById(custId).get();
        pet.setCust(customer);
        return Pet.toModel(petRepo.save(pet));
    }

}
