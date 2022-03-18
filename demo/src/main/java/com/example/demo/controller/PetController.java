package com.example.demo.controller;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.PetEntity;
import com.example.demo.service.CustomerService;
import com.example.demo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pets")

public class PetController {
    @Autowired
    private PetService petService;

    @PostMapping
    public ResponseEntity createPet(@RequestBody PetEntity pet,
                                         @RequestParam Long custId) {
        try {
            return ResponseEntity.ok(petService.createPet(pet,custId));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

}
