package com.example.kubernetes.controller;

import com.example.kubernetes.model.User;
import com.example.kubernetes.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.createUser(user);
    }
    @GetMapping
    public Collection<User> getAll() {
        return service.getAllUsers();
    }
}
