package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<CustomerEntity> custs;

    public UserEntity(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public UserEntity() {
    }

    public List<CustomerEntity> getCusts() {
        return custs;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", custs=" + custs +
                '}';
    }



    public void setCusts(List<CustomerEntity> custs) {
        this.custs = custs;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
