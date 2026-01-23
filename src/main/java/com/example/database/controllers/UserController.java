package com.example.database.controllers;

import com.example.database.enteties.User;
import com.example.database.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("getAllUsers")
    List<User> getAllUsers(){
        return (List<User>) repository.findAll();
    }

}
