package com.example.demo.model;

import com.example.demo.entity.UserEntity;


import java.util.List;
import java.util.stream.Collectors;

public class User {
    private Long id;
    private String username;
    private List<Customer> custs;

    public static User toModel(UserEntity entity) {
        User model = new User();
        model.setId(entity.getId());
        model.setUsername(entity.getUsername());
        model.setCusts(entity.getCusts().stream().map(Customer::toModel).collect(Collectors.toList()));
        return model;
    }


    public User() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Customer> getCusts() {
        return custs;
    }

    public void setCusts(List<Customer> custs) {
        this.custs = custs;
    }

}
