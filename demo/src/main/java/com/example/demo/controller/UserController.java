package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.exception.UserAlreadyExistException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userservice;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user) {
        try {
            userservice.registration(user);
            return ResponseEntity.ok("Sasy bibu");
        } catch (UserAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Нахуй иди");
        }
    }

    @GetMapping
    public ResponseEntity getOneUser(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(userservice.getOne(id));
        } catch (UserNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Нахуй иди");
        }
    }

//    @GetMapping("/users")
//    public ResponseEntity getAllUsers(@RequestParam Long id) {
//        try {
//            return ResponseEntity.ok(userservice.getOne(id));
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().body("Нахуй иди");
//        }
//    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id){
        try {
            return ResponseEntity.ok(userservice.delete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Нахуй иди");
        }
    }




//    @RequestMapping("/userez")
//    public ResponseEntity greeting(@RequestParam Long id) {
//        try {
//            return ResponseEntity.ok(userservice.getOne(id));
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().body("Нахуй иди");
//        }
//    }


}
