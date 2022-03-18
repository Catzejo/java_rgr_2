package com.example.demo.model;

import com.example.demo.entity.CustomerEntity;

import java.util.List;
import java.util.stream.Collectors;


public class Customer {
    private Long id;
    private String name;
    private List<Pet> pets;

    public static Customer toModel(CustomerEntity entity) {
        Customer model = new Customer();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setPets(entity.getPets().stream().map(Pet::toModel).collect(Collectors.toList()));
        return model;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

}
