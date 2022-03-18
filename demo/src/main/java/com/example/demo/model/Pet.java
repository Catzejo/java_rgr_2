package com.example.demo.model;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.PetEntity;

import java.util.stream.Collectors;

public class Pet {
    private Long id;
    private String petName;

    public static Pet toModel(PetEntity entity) {
        Pet model = new Pet();
        model.setId(entity.getId());
        model.setPetName(entity.getPetName());

        return model;
    }


    public Pet() {
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
