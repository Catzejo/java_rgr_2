package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class PetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String petName;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private CustomerEntity cust;


    public PetEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public CustomerEntity getCust() {
        return cust;
    }

    public void setCust(CustomerEntity cust) {
        this.cust = cust;
    }
}
